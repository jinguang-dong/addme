package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbu {
    public pcs a;
    public File b;
    public lsu c;
    public lsw d;
    public rwc e;
    public ppo f;
    public pas g;
    public int h;
    public long i;
    public lte j;
    public byte k;
    private long l;
    private int m;

    public gbu() {
        throw null;
    }

    public final gbv a() {
        pcs pcsVar;
        File file;
        lsu lsuVar;
        lsw lswVar;
        ppo ppoVar;
        pas pasVar;
        lte lteVar;
        if (this.k != 15 || (pcsVar = this.a) == null || (file = this.b) == null || (lsuVar = this.c) == null || (lswVar = this.d) == null || (ppoVar = this.f) == null || (pasVar = this.g) == null || (lteVar = this.j) == null) {
            throw new IllegalStateException();
        }
        return new gbv(pcsVar, file, lsuVar, lswVar, this.e, ppoVar, pasVar, this.h, this.i, this.l, this.m, lteVar);
    }

    public final void b(long j) {
        this.l = j;
        this.k = (byte) (this.k | 4);
    }

    public final void c(int i) {
        this.m = i;
        this.k = (byte) (this.k | 8);
    }

    public gbu(byte[] bArr) {
        this.e = rvk.a;
    }
}
