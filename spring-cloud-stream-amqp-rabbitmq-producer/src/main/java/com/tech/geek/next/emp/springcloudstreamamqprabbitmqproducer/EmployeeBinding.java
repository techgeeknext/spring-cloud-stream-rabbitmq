package com.tech.geek.next.emp.springcloudstreamamqprabbitmqproducer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface EmployeeBinding {
    @Output("empChannel")
    MessageChannel publishMessage();
}