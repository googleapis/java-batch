// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/batch/v1/job.proto

package com.google.cloud.batch.v1;

public interface JobNotificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.JobNotification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Pub/Sub topic where notifications like the job state changes
   * will be published. This topic exist in the same project as the job
   * and billings will be charged to this project.
   * If not specified, no Pub/Sub messages will be sent.
   * Topic format: `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string pubsub_topic = 1;</code>
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();
  /**
   * <pre>
   * The Pub/Sub topic where notifications like the job state changes
   * will be published. This topic exist in the same project as the job
   * and billings will be charged to this project.
   * If not specified, no Pub/Sub messages will be sent.
   * Topic format: `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string pubsub_topic = 1;</code>
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString
      getPubsubTopicBytes();

  /**
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   * @return The message.
   */
  com.google.cloud.batch.v1.JobNotification.Message getMessage();
  /**
   * <pre>
   * The attribute requirements of messages to be sent to this Pub/Sub topic.
   * Without this field, no message will be sent.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.JobNotification.Message message = 2;</code>
   */
  com.google.cloud.batch.v1.JobNotification.MessageOrBuilder getMessageOrBuilder();
}