package defpackage;

import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jmc {
    public static final sgv a = sgv.g("jmc");
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;

    public jmc(boolean z, int i, int i2, int i3, int i4, boolean z2) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = false;
        this.h = z2;
    }

    public static int a(edw edwVar, String str) {
        if (edwVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return edwVar.b("http://ns.google.com/photos/1.0/panorama/", str).intValue();
        }
        return 0;
    }

    public static boolean b(edw edwVar, String str) {
        if (edwVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
            return ((Boolean) ((eek) edwVar).m("http://ns.google.com/photos/1.0/panorama/", str, 1)).booleanValue();
        }
        return false;
    }

    public static boolean c(double d, double d2, double d3) {
        return Math.abs(d - d2) < d3;
    }

    public static void d(edw edwVar, String str) {
        if (edwVar.e("http://ns.google.com/photos/1.0/panorama/", str)) {
        }
    }

    public jmc(int i, int i2) {
        Calendar.getInstance();
        Calendar.getInstance();
        this.b = true;
        this.c = i;
        this.d = i2;
        this.e = i;
        this.f = i2;
        this.g = true;
        this.h = false;
    }
}
