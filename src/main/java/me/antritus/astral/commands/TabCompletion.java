package me.antritus.astral;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TabCompletion
{
	String name();
	SenderType sender();
}