package defpackage;

import com.google.vr.audio.Cf.qcjAcSmlN;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjm {
    public int b;
    public boolean c;
    public final cjn d;
    public cjm e;
    public cji h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = Integer.MIN_VALUE;

    public cjm(cjn cjnVar, int i) {
        this.d = cjnVar;
        this.i = i;
    }

    public final int a() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int b() {
        cjm cjmVar;
        if (this.d.ah == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (cjmVar = this.e) == null || cjmVar.d.ah != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, ckg ckgVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                chx.d(((cjm) it.next()).d, i, arrayList, ckgVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        cjm cjmVar = this.e;
        if (cjmVar != null && (hashSet = cjmVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            cjm cjmVar = (cjm) it.next();
            int i = cjmVar.i - 1;
            if ((i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : cjmVar.d.K : cjmVar.d.J : cjmVar.d.M : cjmVar.d.L).h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        cji cjiVar = this.h;
        if (cjiVar == null) {
            this.h = new cji(1);
        } else {
            cjiVar.c();
        }
    }

    public final void j(cjm cjmVar, int i, int i2) {
        if (cjmVar == null) {
            d();
            return;
        }
        this.e = cjmVar;
        if (cjmVar.a == null) {
            cjmVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.ai);
        sb.append(":");
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = qcjAcSmlN.zhMdfXqlKbTN;
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        sb.append(str);
        return sb.toString();
    }
}
