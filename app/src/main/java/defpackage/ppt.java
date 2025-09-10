package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppt {
    public Context a;
    public ContentResolver b;
    public String c;
    public int d;
    public String e;
    public byte f;
    private Uri g;
    private Uri h;
    private String i;
    private String j;
    private String k;
    private int l;
    private int m;

    public final ppu a() {
        Context context;
        ContentResolver contentResolver;
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (this.f != 15 || (context = this.a) == null || (contentResolver = this.b) == null || (uri = this.g) == null || (uri2 = this.h) == null || (str = this.c) == null || (str2 = this.i) == null || (str3 = this.j) == null || (str4 = this.e) == null || (str5 = this.k) == null) {
            throw new IllegalStateException();
        }
        return new ppu(context, contentResolver, uri, uri2, str, str2, str3, this.d, str4, str5, this.l, this.m);
    }

    public final void b() {
        this.j = "is_pending";
    }

    public final void c() {
        this.k = "media_type";
    }

    public final void d(int i) {
        this.l = i;
        this.f = (byte) (this.f | 4);
    }

    public final void e(int i) {
        this.m = i;
        this.f = (byte) (this.f | 8);
    }

    public final void f() {
        this.i = "mime_type";
    }

    public final void g(Uri uri) {
        uri.getClass();
        this.g = uri;
    }

    public final void h(Uri uri) {
        uri.getClass();
        this.h = uri;
    }
}
