����   7 f  Main  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LMain; main ([Ljava/lang/String;)V	    java/util/Locale   US Ljava/util/Locale;
     
setDefault (Ljava/util/Locale;)V  java/util/Scanner	    java/lang/System   ! in Ljava/io/InputStream;
  #  $ (Ljava/io/InputStream;)V	  & ' ( out Ljava/io/PrintStream; * !Quantas linhas vai ser a matriz? 
 , . - java/io/PrintStream / 0 println (Ljava/lang/String;)V
  2 3 4 nextInt ()I 6 "Quantas colunas vai ter a matriz?  8 [[I   : ; < makeConcatWithConstants (II)Ljava/lang/String; > 
 MATRIZ DIGITADA:   @ ; A (I)Ljava/lang/String;
 , C / 
  E F  close args [Ljava/lang/String; sc Ljava/util/Scanner; M I N i j mat StackMapTable H 
SourceFile 	Main.java BootstrapMethods
 W Y X $java/lang/invoke/StringConcatFactory ; Z �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; V ] Elemeno [,]:  _   InnerClasses b %java/lang/invoke/MethodHandles$Lookup d java/lang/invoke/MethodHandles Lookup !               /     *� �    
                    	      �     �� � � Y� � "L� %)� ++� 1=� %5� ++� 1>� 7:6� 06� !� %� 9  � +2+� 1O���߄��в %=� +6� .6� � %2.� ?  � +���� %� B����+� D�    
   Z    	  
       &  +  3  9  ?  N  Z  c  l  t  z  �  �  �   �  � # � $    R    � G H    � I J   � K L  + � M L  6 z N L  < * O L  } ( O L  3 } P 8  Q   i � 9  R   7  �   R  7  �   R   7  �   R  7  �   R   7    S    T U     [  \ [  ^ `   
  a c e 