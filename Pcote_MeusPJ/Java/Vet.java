����   7 \  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * "Quantos numeros voce vai digitar? 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 Digite um numero: 
  8 9 : 
nextDouble ()D < 
 NUMEROS DIGITADOS:  > %.1f
 @ B A java/lang/Double C D valueOf (D)Ljava/lang/Double;
 F H G java/lang/String I J format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
  L M  close args [Ljava/lang/String; sc Ljava/util/Scanner; N I i vet [D StackMapTable O V 
SourceFile 	Main.java !               /     *� �    
                    	           s� � � Y� � "L� %)� ++� 1=�:>� � %5� ++� 7R���� %;� +>� � %=� Y1� ?S� E� +����+� K�    
   >    	  
       #  (  0  8  @  H  M  f  n  r     4    s N O    b P Q   U R S  % N T S  # P U V  W    � (  X  Y    Z    [