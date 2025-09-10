package com.google.android.apps.camera.legacy.lightcycle.storage;

import defpackage.lsi;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LocalSessionStorage implements Serializable {
    public String a;
    public lsi b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public int j;

    public final String toString() {
        return "Session ID : " + this.a + "\n BaseDir : " + this.c + "\n sessionRelativeDir : " + this.f + "\n SessionBaseDir : " + this.d + "\n SessionDir : " + this.e + "\n thumbnail : " + this.g + "\n metadata : " + this.h + "\n orientationFile : " + this.i;
    }
}
