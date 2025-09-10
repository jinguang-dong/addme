package defpackage;

import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwn implements tzt {
    private final tzx a;
    private final tzx b;
    private final tzx c;
    private final /* synthetic */ int d;

    public qwn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i) {
        this.d = i;
        this.a = tzxVar;
        this.b = tzxVar2;
        this.c = tzxVar3;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        int i = this.d;
        if (i == 0) {
            return new qwm(((imm) this.a).b(), ((jaf) this.b).b(), ((qwj) this.c).a(), new ClearcutMetricSnapshotTransmitter());
        }
        if (i == 1) {
            Object sfmVar = (((rwc) ((tzu) this.c).a).h() || ((rwc) ((tzu) this.b).a).h()) ? new sfm((qqs) this.a.a()) : sfd.a;
            sfmVar.getClass();
            return sfmVar;
        }
        if (i == 2) {
            return new lat((uhf) this.a.a(), (rau) this.b.a(), (qqe) this.c.a());
        }
        Object obj = ((tzu) this.b).a;
        final sjp sjpVarA = ((rbd) this.a).a();
        final Map map = (Map) obj;
        final Map map2 = ((tzq) this.c).a;
        return new rbf() { // from class: rbn
            @Override // defpackage.rbf
            public final void a() {
                sjp sjpVar = sjpVarA;
                rsf rsfVarK = rnt.k("Startup Listeners");
                try {
                    boolean zA = sjpVar.a();
                    Map map3 = map2;
                    if (zA) {
                        double dRandom = Math.random();
                        Map map4 = map;
                        if (dRandom < 0.5d) {
                            qpt.ac(map3);
                            qpt.ac(map4);
                        } else {
                            qpt.ac(map4);
                            qpt.ac(map3);
                        }
                    } else {
                        qpt.ac(map3);
                    }
                    rsfVarK.close();
                } catch (Throwable th) {
                    try {
                        rsfVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
    }

    public qwn(tzx tzxVar, tzx tzxVar2, tzx tzxVar3, int i, byte[] bArr) {
        this.d = i;
        this.c = tzxVar;
        this.b = tzxVar2;
        this.a = tzxVar3;
    }
}
