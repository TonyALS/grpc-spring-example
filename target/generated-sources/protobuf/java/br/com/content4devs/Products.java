// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products.proto

package br.com.content4devs;

public final class Products {
  private Products() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_content4devs_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_content4devs_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_content4devs_ProductsList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_content4devs_ProductsList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_content4devs_RequestById_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_content4devs_RequestById_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_content4devs_ProductServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_content4devs_ProductServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_br_com_content4devs_ProductServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_br_com_content4devs_ProductServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016products.proto\022\023br.com.content4devs\"\007\n" +
      "\005Empty\"M\n\014ProductsList\022=\n\010products\030\001 \003(\013" +
      "2+.br.com.content4devs.ProductServiceRes" +
      "ponse\"\031\n\013RequestById\022\n\n\002id\030\001 \001(\003\"O\n\025Prod" +
      "uctServiceRequest\022\014\n\004name\030\001 \001(\t\022\r\n\005price" +
      "\030\002 \001(\001\022\031\n\021quantity_in_stock\030\003 \001(\005\"\\\n\026Pro" +
      "ductServiceResponse\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030" +
      "\002 \001(\t\022\r\n\005price\030\003 \001(\001\022\031\n\021quantity_in_stoc" +
      "k\030\004 \001(\0052\351\002\n\017ProductsService\022c\n\006Create\022*." +
      "br.com.content4devs.ProductServiceReques" +
      "t\032+.br.com.content4devs.ProductServiceRe" +
      "sponse\"\000\022[\n\010FindById\022 .br.com.content4de" +
      "vs.RequestById\032+.br.com.content4devs.Pro" +
      "ductServiceResponse\"\000\022H\n\006Delete\022 .br.com" +
      ".content4devs.RequestById\032\032.br.com.conte" +
      "nt4devs.Empty\"\000\022J\n\007FindAll\022\032.br.com.cont" +
      "ent4devs.Empty\032!.br.com.content4devs.Pro" +
      "ductsList\"\000B\027\n\023br.com.content4devsP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_br_com_content4devs_Empty_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_br_com_content4devs_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_content4devs_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_br_com_content4devs_ProductsList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_br_com_content4devs_ProductsList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_content4devs_ProductsList_descriptor,
        new java.lang.String[] { "Products", });
    internal_static_br_com_content4devs_RequestById_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_br_com_content4devs_RequestById_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_content4devs_RequestById_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_br_com_content4devs_ProductServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_br_com_content4devs_ProductServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_content4devs_ProductServiceRequest_descriptor,
        new java.lang.String[] { "Name", "Price", "QuantityInStock", });
    internal_static_br_com_content4devs_ProductServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_br_com_content4devs_ProductServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_br_com_content4devs_ProductServiceResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Price", "QuantityInStock", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}