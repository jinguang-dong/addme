package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mby extends qpt {
    final /* synthetic */ mca a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mby(mca mcaVar) {
        super((char[]) null);
        this.a = mcaVar;
    }

    @Override // defpackage.qpt
    public final void fo(byte[] bArr) {
        if (bArr.length > 0) {
            sgv sgvVar = mca.a;
        }
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((mch) it.next()).a(bArr);
        }
    }

    @Override // defpackage.qpt
    public final void fp() {
        sgv sgvVar = mca.a;
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((mch) it.next()).b();
        }
    }

    @Override // defpackage.qpt
    public final void fq(int i) {
        sgv sgvVar = mca.a;
        for (mch mchVar : this.a.h) {
            int i2 = 1;
            if (i != 0) {
                if (i != 1) {
                    i2 = 3;
                    if (i == 2) {
                        continue;
                    } else {
                        if (i != 3) {
                            throw new IllegalArgumentException("Unknown fallback reason");
                        }
                        i2 = 4;
                    }
                } else {
                    i2 = 2;
                }
            }
            mchVar.c(i2);
        }
    }
}
