����   7 y  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Quantos numeros vai digitar? 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 Digite o numero: 
  8 9 : 
nextDouble ()D
 , < /  > 	VALORES:  @ %.1f
 B D C java/lang/Double E F valueOf (D)Ljava/lang/Double;
 H J I java/lang/String K L format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; N %.2f   P Q R makeConcatWithConstants &(Ljava/lang/String;)Ljava/lang/String;  P
  U V  close args [Ljava/lang/String; sc Ljava/util/Scanner; N I soma D media vet [D i StackMapTable X a 
SourceFile 	Main.java BootstrapMethods
 j l k $java/lang/invoke/StringConcatFactory Q m �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; i p Soma:  r Media:  InnerClasses u %java/lang/invoke/MethodHandles$Lookup w java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      � 	 	   ڲ � � Y� � "L� %)� ++� 1=�:6� � %5� ++� 7R���� %� ;� %=� +6� � %?� Y1� AS� G� +���� %� ;J6� )1cJ���� %M� Y)� AS� G� O  � +)�o9� %M� Y� AS� G� S  � ++� T�    
   b    	  
       #  )  1  :  C  I  Q  W  p  y     � ! � " � ! � $ � & � ' � ) � *    \ 	   � W X    � Y Z   � [ \  � Y ] ^  � ! _ ^  # � ` a  &  b \  T % b \  �  b \  c   1 � ) 	 d      e  �   d    e  
  f    g h     n  o n  q s   
  t v x 