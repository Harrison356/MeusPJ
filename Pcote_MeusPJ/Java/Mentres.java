����   7 \  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Digite o primeiro valor: 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 Digite o segundo valor:  8 Digite o terceiro valor:    : ; < makeConcatWithConstants (I)Ljava/lang/String;
  > ?  close args [Ljava/lang/String; sc Ljava/util/Scanner; n1 I n2 n3 men StackMapTable A 
SourceFile 	Main.java BootstrapMethods
 O Q P $java/lang/invoke/StringConcatFactory ; R �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; N U Menor:  InnerClasses X %java/lang/invoke/MethodHandles$Lookup Z java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      =     l� � � Y� � "L� %)� ++� 1=� %5� ++� 1>� %7� ++� 16� � 	6� � 	6� 6� %� 9  � ++� =�    
   J    	  
       &  +  3  9  D  G  J  P  S  V  Z  g   k !    R    l @ A    [ B C   N D E  + A F E  9 3 G E  G  H E  S  H E  Z  H E  I    � J  J   �   K    L M     S  T V   
  W Y [ 