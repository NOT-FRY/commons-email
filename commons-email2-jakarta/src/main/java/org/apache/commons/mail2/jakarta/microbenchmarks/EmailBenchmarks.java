/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.mail2.jakarta.microbenchmarks;
import org.apache.commons.mail2.core.EmailException;
import org.apache.commons.mail2.jakarta.*;
import org.openjdk.jmh.annotations.*;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

@Fork(1)
@Threads(1)
@Warmup(iterations = 5)
@Measurement(iterations = 10)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class EmailBenchmarks {

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
   // @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public void addRecipientsBenchmark() throws EmailException {
        SimpleEmail email = new SimpleEmail();
        email.addTo("recipient1@example.com");
        email.addCc("recipient2@example.com");
        email.addBcc("recipient3@example.com");
        email.setSubject("Benchmark Test");
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void simpleEmailBenchmark() throws EmailException{
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.example.com");
        email.setSmtpPort(587);
        email.setAuthentication("user", "password");
        email.setFrom("test@example.com");
        email.addTo("recipient@example.com");
        email.setSubject("Benchmark Test");
        email.buildMimeMessage();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void addAttachmentBenchmark() throws EmailException {
        EmailAttachment attachment = new EmailAttachment();
        String workingDirectory = System.getProperty("user.dir");
        Path filePath = Paths.get(workingDirectory, "src", "main", "resources", "email-logo-white.png");
        attachment.setPath(filePath.toString());
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Sample Attachment");
        attachment.setName("file.txt");

        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("smtp.example.com");
        email.setSmtpPort(587);
        email.setAuthentication("user", "password");
        email.setFrom("sender@example.com");
        email.addTo("recipient@example.com");
        email.attach(attachment);
        email.buildMimeMessage();
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void htmlEmailBenchmark() throws EmailException {
        HtmlEmail email = new HtmlEmail();
        email.setHostName("smtp.example.com");
        email.setSmtpPort(587);
        email.setAuthentication("user", "password");
        email.setFrom("sender@example.com");
        email.addTo("recipient@example.com");
        email.setSubject("Benchmark Test");
        email.setHtmlMsg("<h1>This is a test</h1>");
        email.buildMimeMessage();
    }



}
