package defpackage;

import android.content.Context;
import java.text.DateFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppi {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    public boolean i;
    public scn j;
    public DateFormat k;
    public sbv l;
    public Context m;
    public String n;
    public String o;
    public String p;
    public ppu q;
    public boolean r;
    public long s;
    public byte t;

    public final void a(int i) {
        this.g = i;
        this.t = (byte) (this.t | 1);
    }

    public final void b() {
        this.f = "COVER";
    }

    public final void c(scn scnVar) {
        scnVar.getClass();
        this.j = scnVar;
    }

    public final void d() {
        this.e = "BURST-";
    }

    public final void e(boolean z) {
        this.h = z;
        this.t = (byte) (this.t | 2);
    }

    public final void f(boolean z) {
        this.i = z;
        this.t = (byte) (this.t | 4);
    }

    public final void g() {
        this.s = 20000L;
        this.t = (byte) (this.t | 32);
    }

    public final void h() {
        this.n = "";
    }

    public final void i() {
        this.p = "Camera";
    }
}
