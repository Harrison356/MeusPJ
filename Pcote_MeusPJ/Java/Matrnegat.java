����   7 g  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * Qual a ordem da matriz? 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 [[I   8 9 : makeConcatWithConstants (II)Ljava/lang/String; < Diagonal principal:   > 9 ? (I)Ljava/lang/String;
 , A /   >
  D E  close args [Ljava/lang/String; sc Ljava/util/Scanner; cont I N mat i j StackMapTable G 
SourceFile 	Main.java BootstrapMethods
 V X W $java/lang/invoke/StringConcatFactory 9 Y �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; U \ Elemento [,]:  ^  ` Quantidade de negativos:  InnerClasses c %java/lang/invoke/MethodHandles$Lookup e java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      �     β � � Y� � "L� %)� ++� 1>� 5:6� 06� !� %� 7  � +2+� 1O���߄��в %;� +6� � %2.� =  � +���� %� @=6� #6� 2.� �������ݲ %� B  � ++� C�    
   j    	  
       &  ,  2  A  M  V  _  g  m  �  �  �   � ! � " � # � $ � " � ! � ( � * � +    f 
   � F G    � H I  � = J K   � L K  & � M 6  ) 6 N K  / ' O K  j  N K  � ) N K  �  O K  P   ; � ,  Q   5  � � �   Q  5  � �   R    S T     Z  [ Z  ] Z  _ a   
  b d f 