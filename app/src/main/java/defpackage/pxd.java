package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxd {
    public rwc a;
    private Uri b;
    private String c;
    private pxc d;
    private int e;
    private sbp f;
    private tnw g;
    private byte h;

    public pxd() {
        throw null;
    }

    public final pxe a() {
        Uri uri;
        String str;
        pxc pxcVar;
        sbp sbpVar;
        tnw tnwVar;
        String str2 = this.c;
        if (str2 == null) {
            throw new IllegalStateException();
        }
        if (str2.startsWith("inlinefile")) {
            rnt.B(this.a.h(), "InlineDownloadParams must be set when using inlinefile: scheme");
            c(pxc.a);
        }
        if (this.h != 1 || (uri = this.b) == null || (str = this.c) == null || (pxcVar = this.d) == null || (sbpVar = this.f) == null || (tnwVar = this.g) == null) {
            throw new IllegalStateException();
        }
        return new pxe(uri, str, pxcVar, this.e, sbpVar, this.a, tnwVar);
    }

    public final void b(tnw tnwVar) {
        tnwVar.getClass();
        this.g = tnwVar;
    }

    public final void c(pxc pxcVar) {
        pxcVar.getClass();
        this.d = pxcVar;
    }

    public final void d(sbp sbpVar) {
        sbpVar.getClass();
        this.f = sbpVar;
    }

    public final void e(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public final void f(int i) {
        this.e = i;
        this.h = (byte) 1;
    }

    public final void g(String str) {
        str.getClass();
        this.c = str;
    }

    public pxd(byte[] bArr) {
        this.a = rvk.a;
    }
}
