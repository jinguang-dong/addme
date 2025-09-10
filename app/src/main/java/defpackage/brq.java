package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brq implements brc {
    private final btw a;
    private final brp b;
    private final btw c;
    private final brp d;
    private final btg e;
    private final btg f;
    private final /* synthetic */ int g;
    private final Object h;

    public brq(String str, int i) {
        this.g = i;
        this.h = str;
        this.e = new bth(str.concat(" source"), 0);
        this.f = new bth(str.concat(" target"), 0);
        this.a = new btw();
        this.b = new brp();
        this.c = new btw();
        this.d = new brp();
    }

    @Override // defpackage.brc
    public final btg a() {
        int i = this.g;
        return this.e;
    }

    @Override // defpackage.brc
    public final btg b() {
        int i = this.g;
        return this.f;
    }

    @Override // defpackage.btg
    public final btw c() {
        int i = this.g;
        return this.a;
    }

    @Override // defpackage.btg
    public final btw d() {
        int i = this.g;
        return this.c;
    }

    @Override // defpackage.btg
    public final brp e() {
        int i = this.g;
        return this.d;
    }

    @Override // defpackage.btg
    public final brp f() {
        int i = this.g;
        return this.b;
    }

    public final String toString() {
        int i = this.g;
        Object obj = this.h;
        return i != 0 ? (String) obj : rnt.aH((Object[]) obj, ",", "InnerInsetsRulers(", ")", 56);
    }

    public brq(btg[] btgVarArr, int i) {
        this.g = i;
        this.h = btgVarArr;
        int length = btgVarArr.length;
        btw[] btwVarArr = new btw[length];
        for (int i2 = 0; i2 < length; i2++) {
            btwVarArr[i2] = ((btg[]) this.h)[i2].c();
        }
        this.a = new btw(new bro(btwVarArr, 6));
        int length2 = ((btg[]) this.h).length;
        brp[] brpVarArr = new brp[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            brpVarArr[i3] = ((btg[]) this.h)[i3].f();
        }
        this.b = new brp(new bro(brpVarArr, 0));
        int length3 = ((btg[]) this.h).length;
        btw[] btwVarArr2 = new btw[length3];
        for (int i4 = 0; i4 < length3; i4++) {
            btwVarArr2[i4] = ((btg[]) this.h)[i4].d();
        }
        this.c = new btw(new bro(btwVarArr2, 7));
        int length4 = ((btg[]) this.h).length;
        brp[] brpVarArr2 = new brp[length4];
        for (int i5 = 0; i5 < length4; i5++) {
            brpVarArr2[i5] = ((btg[]) this.h)[i5].e();
        }
        this.d = new brp(new bro(brpVarArr2, 2));
        toString();
        String strConcat = toString().concat(" source");
        int length5 = ((btg[]) this.h).length;
        btg[] btgVarArr2 = new btg[length5];
        for (int i6 = 0; i6 < length5; i6++) {
            btg btgVarA = ((btg[]) this.h)[i6];
            if (btgVarA instanceof brc) {
                btgVarA = ((brc) btgVarA).a();
            }
            btgVarArr2[i6] = btgVarA;
        }
        this.e = new bth(strConcat, 1, null);
        toString();
        String strConcat2 = toString().concat(" target");
        int length6 = ((btg[]) this.h).length;
        btg[] btgVarArr3 = new btg[length6];
        for (int i7 = 0; i7 < length6; i7++) {
            btg btgVarB = ((btg[]) this.h)[i7];
            if (btgVarB instanceof brc) {
                btgVarB = ((brc) btgVarB).b();
            }
            btgVarArr3[i7] = btgVarB;
        }
        this.f = new bth(strConcat2, 1, null);
    }
}
