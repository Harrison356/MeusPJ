����   7 K  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; *  Digite o valor inteiro de dois: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I
 , 6 / 7 (I)V 9 DECRESCENTE !!! ; CRESCENTE !!! = Digite outros dois numero: 
  ? @  close args [Ljava/lang/String; sc Ljava/util/Scanner; x I y StackMapTable 
SourceFile 	Main.java !               /     *� �    
                    	           q� � � Y� � "L� %)� ++� 1=+� 1>� D� � %`� 5� %8� +� � � %`� 5� %:� +� %<� ++� 1=+� 1>���+� >�    
   J    	  
       #  &  +  4  <  D  M  U  ]  b  g  l   p !    *    q A B    ` C D   S E F  # N G F  H    � &   I    J