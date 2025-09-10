package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppu {
    public final Context a;
    public final ContentResolver b;
    public final Uri c;
    public final Uri d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final int l;

    public ppu() {
        throw null;
    }

    public static ppt a(Context context) {
        ppt pptVar = new ppt();
        pptVar.a = context;
        ContentResolver contentResolver = context.getContentResolver();
        contentResolver.getClass();
        pptVar.b = contentResolver;
        byte b = pptVar.f;
        pptVar.d = 1;
        pptVar.f = (byte) (b | 3);
        return pptVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppu) {
            ppu ppuVar = (ppu) obj;
            if (this.a.equals(ppuVar.a) && this.b.equals(ppuVar.b) && this.c.equals(ppuVar.c) && this.d.equals(ppuVar.d) && this.e.equals(ppuVar.e) && this.f.equals(ppuVar.f) && this.g.equals(ppuVar.g) && this.h == ppuVar.h && this.i.equals(ppuVar.i) && this.j.equals(ppuVar.j) && this.k == ppuVar.k && this.l == ppuVar.l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l ^ ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * (-721379959)) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003);
    }

    public final String toString() {
        Uri uri = this.d;
        Uri uri2 = this.c;
        ContentResolver contentResolver = this.b;
        return "{" + String.valueOf(this.a) + ", " + String.valueOf(contentResolver) + ", " + String.valueOf(uri2) + ", " + String.valueOf(uri) + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", 0, " + this.i + ", " + this.j + ", " + this.k + ", " + this.l + "}";
    }

    public ppu(Context context, ContentResolver contentResolver, Uri uri, Uri uri2, String str, String str2, String str3, int i, String str4, String str5, int i2, int i3) {
        this.a = context;
        this.b = contentResolver;
        this.c = uri;
        this.d = uri2;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = i;
        this.i = str4;
        this.j = str5;
        this.k = i2;
        this.l = i3;
    }
}
