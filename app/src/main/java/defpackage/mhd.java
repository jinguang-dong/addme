package defpackage;

import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhd implements pau {
    final /* synthetic */ Object a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final /* synthetic */ int c;

    public mhd(fbv fbvVar, int i) {
        this.c = i;
        this.a = fbvVar;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) throws Resources.NotFoundException {
        sbp sbpVar;
        sbp sbpVar2;
        int i = this.c;
        if (i == 0) {
            mhg mhgVar = (mhg) obj;
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            mhe mheVar = (mhe) this.a;
            mheVar.u(rvk.a, mhgVar, ((Boolean) mheVar.d.dL()).booleanValue());
            return;
        }
        if (i == 1) {
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            ((fbv) this.a).e();
            return;
        }
        if (i == 2) {
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            mhe mheVar2 = (mhe) this.a;
            mheVar2.u(rvk.a, (mhg) mheVar2.b.dL(), ((Boolean) mheVar2.d.dL()).booleanValue());
            return;
        }
        if (i == 3) {
            Boolean bool = (Boolean) obj;
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            if (bool.booleanValue()) {
                mhe mheVar3 = (mhe) this.a;
                mheVar3.l();
                mheVar3.f();
                return;
            } else {
                mhe mheVar4 = (mhe) this.a;
                mheVar4.s();
                mheVar4.m(rvk.a);
                return;
            }
        }
        if (i == 4) {
            Boolean bool2 = (Boolean) obj;
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            if (bool2.booleanValue()) {
                mhe mheVar5 = (mhe) this.a;
                mheVar5.l();
                if (((Boolean) mheVar5.d.dL()).booleanValue()) {
                    return;
                }
                mheVar5.f();
                return;
            }
            mhe mheVar6 = (mhe) this.a;
            mheVar6.s();
            if (((Boolean) mheVar6.d.dL()).booleanValue()) {
                return;
            }
            mheVar6.m(rvk.a);
            return;
        }
        if (i != 5) {
            Boolean bool3 = (Boolean) obj;
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            Object obj2 = this.a;
            if (bool3.booleanValue()) {
                sbpVar2 = iqi.b;
            } else {
                int i2 = sbp.d;
                sbpVar2 = sex.a;
            }
            ((mzk) obj2).e(sbpVar2);
            return;
        }
        Boolean bool4 = (Boolean) obj;
        if (this.b.compareAndSet(true, false)) {
            return;
        }
        Object obj3 = this.a;
        if (bool4.booleanValue()) {
            sbpVar = mzk.b;
        } else {
            int i3 = sbp.d;
            sbpVar = sex.a;
        }
        ((mzk) obj3).e(sbpVar);
    }

    public mhd(mhe mheVar, int i) {
        this.c = i;
        this.a = mheVar;
    }

    public mhd(mhe mheVar, int i, byte[] bArr) {
        this.c = i;
        this.a = mheVar;
    }

    public mhd(mhe mheVar, int i, char[] cArr) {
        this.c = i;
        this.a = mheVar;
    }

    public mhd(mhe mheVar, int i, short[] sArr) {
        this.c = i;
        this.a = mheVar;
    }

    public mhd(mzk mzkVar, int i) {
        this.c = i;
        this.a = mzkVar;
    }

    public mhd(mzk mzkVar, int i, byte[] bArr) {
        this.c = i;
        this.a = mzkVar;
    }
}
