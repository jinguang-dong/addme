package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ccv implements uiq {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ccv(int i, bte bteVar, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.c = bteVar;
        this.b = i2;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                btd.q((btd) obj, (bte) this.c, this.a, this.b);
                return ufg.a;
            }
            if (i != 2) {
                btd.q((btd) obj, (bte) this.c, ukj.x(((this.a - r0.a) - 1) / 2.0f), ukj.x(((this.b - r0.b) - 1) / 2.0f));
                return ufg.a;
            }
            int i2 = this.a;
            bte bteVar = (bte) this.c;
            int i3 = i2 - bteVar.a;
            ((btd) obj).r(bteVar, ((this.b - bteVar.b) & 4294967295L) | ((i3 / 2) << 32));
            return ufg.a;
        }
        ccy ccyVar = (ccy) obj;
        cch cchVar = ccyVar.g;
        int iD = ccyVar.d(this.a);
        int iD2 = ccyVar.d(this.b);
        if (iD < 0 || iD > iD2 || iD2 > cchVar.c.length()) {
            cgh.a("start(" + iD + ") or end(" + iD2 + ") is out of range [0.." + cchVar.c.length() + "], or start > end!");
        }
        Path path = new Path();
        cdy cdyVar = cchVar.b;
        cdyVar.c.getSelectionPath(iD, iD2, path);
        int i4 = cdyVar.e;
        if (i4 != 0 && !path.isEmpty()) {
            path.offset(0.0f, i4);
        }
        Object obj2 = this.c;
        bkn bknVar = new bkn(path);
        float f = ccyVar.e;
        bknVar.n((4294967295L & Float.floatToRawIntBits(f)) | (Float.floatToRawIntBits(0.0f) << 32));
        blb.g((bkn) obj2, bknVar);
        return ufg.a;
    }

    public /* synthetic */ ccv(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
