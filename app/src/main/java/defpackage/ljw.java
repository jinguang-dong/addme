package defpackage;

import com.google.android.apps.camera.rectiface.jni.RectifaceImpl;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljw implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final tzx d;
    private final /* synthetic */ int e;

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i) {
        this.e = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
        this.d = tzxVar4;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        sbv sbvVar;
        boolean z = true;
        switch (this.e) {
            case 0:
                lkk lkkVar = (lkk) this.a.a();
                nms nmsVar = (nms) this.b.a();
                hbj hbjVar = (hbj) this.c.a();
                boolean zBooleanValue = ((Boolean) this.d.a()).booleanValue();
                boolean z2 = lkkVar.equals(lkk.TELE) && hbjVar.p(han.i);
                boolean z3 = lkkVar.equals(lkk.WIDE) && hbjVar.p(han.h);
                boolean z4 = lkkVar.equals(lkk.ULTRAWIDE) && hbjVar.p(han.j) && nmsVar.j() != null;
                if (!zBooleanValue || (!z2 && !z3 && !z4)) {
                    z = false;
                }
                return qpt.bR(lkkVar, nmsVar, z);
            case 1:
                sbv sbvVar2 = (sbv) this.a.a();
                sbp sbpVar = (sbp) this.b.a();
                tzx tzxVar = this.d;
                pjp pjpVarA = ((pab) this.c).a();
                hbj hbjVar2 = (hbj) tzxVar.a();
                if (hbjVar2.o(hal.e) && hbjVar2.o(hal.a) && !sbvVar2.isEmpty()) {
                    Stream map = Collection.EL.stream(sbpVar).map(new jkv(20));
                    int i = sbp.d;
                    Collector collector = ryv.a;
                    sbp sbpVar2 = (sbp) Collection.EL.stream(sbvVar2.keySet()).map(new gwl(pjpVarA, 3)).filter(new hsj(13)).filter(new glx((sbp) map.collect(collector), 15)).sorted(Comparator$CC.comparing(new mcx(1))).map(new jkv(20)).collect(collector);
                    if (sbpVar2.size() != 3) {
                        ((sgt) ljt.a.b().M(4175)).t("Invalid number of camera ids: %d", sbpVar2.size());
                        sbvVar = sfc.a;
                    } else {
                        smx smxVar = new smx(new smy(Stream.CC.of(lkk.ULTRAWIDE, lkk.WIDE, lkk.TELE), Collection.EL.stream(sbpVar2).map(new gwl(sbvVar2, 4))));
                        Collector collectorA = ryv.a(new gwl(smxVar, 10), new gwl(smxVar, 11));
                        Object obj = collectorA.supplier().get();
                        BiConsumer biConsumerAccumulator = collectorA.accumulator();
                        while (smxVar.a()) {
                            biConsumerAccumulator.accept(obj, null);
                        }
                        sbvVar = (sbv) collectorA.finisher().apply(obj);
                    }
                } else {
                    sbvVar = sfc.a;
                }
                sbvVar.getClass();
                return sbvVar;
            case 2:
                return new RectifaceImpl((lge) this.d.a(), (lgo) this.c.a(), (owq) this.a.a(), (hbj) this.b.a());
            case 3:
                return new pmv((luv) this.b.a(), (luv) this.c.a(), (luv) this.d.a(), (luv) this.a.a());
            case 4:
                return new pmv((hbj) this.c.a(), (owq) this.b.a(), (mhq) this.a.a(), (owf) this.d.a());
            case 5:
                owf owfVar = (owf) this.a.a();
                lww lwwVar = (lww) this.d.a();
                Executor executor = (Executor) this.c.a();
                fqg fqgVar = (fqg) this.b.a();
                lwz lwzVar = new lwz(lwwVar, executor);
                lwzVar.g(owfVar);
                lwzVar.k();
                fqgVar.b.d(lwzVar);
                return lwzVar;
            case 6:
                return new mal((mdy) this.a.a(), (owq) this.b.a(), (luj) this.c.a(), (luj) this.d.a());
            case 7:
                tzx tzxVar2 = this.a;
                dx dxVarA = ((imq) this.b).a();
                return new mav(dxVarA);
            default:
                fqg fqgVar2 = (fqg) this.c.a();
                mbq mbqVar = new mbq(((imm) this.b).b(), new ovx(true), this.a, (Executor) this.d.a());
                fqgVar2.b.d(mbqVar);
                return mbqVar;
        }
    }

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, char[] cArr) {
        this.e = i;
        this.d = tzxVar;
        this.c = tzxVar2;
        this.a = tzxVar3;
        this.b = tzxVar4;
    }

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, int[] iArr) {
        this.e = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
        this.d = tzxVar4;
    }

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, short[] sArr) {
        this.e = i;
        this.b = tzxVar;
        this.c = tzxVar2;
        this.d = tzxVar3;
        this.a = tzxVar4;
    }

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, boolean[] zArr) {
        this.e = i;
        this.a = tzxVar;
        this.d = tzxVar2;
        this.c = tzxVar3;
        this.b = tzxVar4;
    }

    public ljw(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, tzx tzxVar4, int i, byte[][] bArr) {
        this.e = i;
        this.b = tzxVar;
        this.a = tzxVar2;
        this.d = tzxVar3;
        this.c = tzxVar4;
    }
}
