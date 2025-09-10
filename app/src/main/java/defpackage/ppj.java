package defpackage;

import android.content.Context;
import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppj {
    public static final SimpleDateFormat a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final scn k;
    public final DateFormat l;
    public final Context m;
    public final String n;
    public final String o;
    public final String p;
    public final ppu q;
    public final boolean r;
    public final long s;
    private final sbv t;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd_HHmmssSSS", Locale.US);
        a = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
    }

    public ppj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ppj) {
            ppj ppjVar = (ppj) obj;
            if (this.b.equals(ppjVar.b) && this.c.equals(ppjVar.c) && this.d.equals(ppjVar.d) && this.e.equals(ppjVar.e) && this.f.equals(ppjVar.f) && this.g.equals(ppjVar.g) && this.h == ppjVar.h && this.i == ppjVar.i && this.j == ppjVar.j && this.k.equals(ppjVar.k) && this.l.equals(ppjVar.l) && ujp.aA(this.t, ppjVar.t) && this.m.equals(ppjVar.m) && this.n.equals(ppjVar.n) && this.o.equals(ppjVar.o) && this.p.equals(ppjVar.p) && this.q.equals(ppjVar.q) && this.r == ppjVar.r && this.s == ppjVar.s) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.s) ^ ((((((((((((((((((((((((((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ (true == this.r ? 1231 : 1237)) * (-721379959));
    }

    public ppj(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, scn scnVar, DateFormat dateFormat, sbv sbvVar, Context context, String str7, String str8, String str9, ppu ppuVar, boolean z3, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = i;
        this.i = z;
        this.j = z2;
        this.k = scnVar;
        this.l = dateFormat;
        this.t = sbvVar;
        this.m = context;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = ppuVar;
        this.r = z3;
        this.s = j;
    }

    public final String toString() {
        ppu ppuVar = this.q;
        Context context = this.m;
        sbv sbvVar = this.t;
        DateFormat dateFormat = this.l;
        return pAAtrB.AWyjHXAcGNEvVCh + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + ", " + this.j + ", " + String.valueOf(this.k) + ", " + String.valueOf(dateFormat) + ", " + String.valueOf(sbvVar) + ", " + String.valueOf(context) + ", " + this.n + ", " + this.o + ", " + this.p + ", " + String.valueOf(ppuVar) + ", " + this.r + ", 0, " + this.s + "}";
    }
}
