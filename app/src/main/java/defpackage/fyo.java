package defpackage;

import android.graphics.PointF;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fyo implements pau {
    final /* synthetic */ Object a;
    private final AtomicBoolean b = new AtomicBoolean(true);
    private final /* synthetic */ int c;

    public fyo(fbv fbvVar, int i) {
        this.c = i;
        this.a = fbvVar;
    }

    @Override // defpackage.pau
    public final /* synthetic */ void a(Object obj) {
        Integer num;
        int i = this.c;
        if (i == 0) {
            PointF pointF = (PointF) obj;
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            fyq fyqVar = (fyq) this.a;
            if (((Boolean) ((ovx) fyqVar.p.a).d).booleanValue()) {
                return;
            }
            fyqVar.e(pointF, false);
            return;
        }
        if (i == 1) {
            if (this.b.compareAndSet(true, false)) {
                return;
            }
            fbv fbvVar = (fbv) this.a;
            fbvVar.e();
            fbvVar.o.close();
            return;
        }
        Boolean bool = (Boolean) obj;
        if (this.b.compareAndSet(true, false)) {
            return;
        }
        if (bool.booleanValue()) {
            Object obj2 = this.a;
            ipk ipkVar = (ipk) obj2;
            ipkVar.m();
            ipkVar.v.post(new ild(obj2, 9));
            ipkVar.v.a = true;
            ipkVar.b.s();
            return;
        }
        Object obj3 = this.a;
        ipk ipkVar2 = (ipk) obj3;
        if (ipkVar2.K.p(gza.b)) {
            owf owfVar = ipkVar2.d;
            if (((nkw) owfVar.dL()).c() && ipkVar2.z != null && !((Boolean) ipkVar2.g.dL()).booleanValue()) {
                owq owqVar = ipkVar2.o;
                Integer num2 = ipkVar2.z;
                num2.getClass();
                owqVar.a(num2);
                ipkVar2.z = null;
            } else if (!((nkw) owfVar.dL()).c() && (num = ipkVar2.y) != null) {
                ipkVar2.n.a(num);
                ipkVar2.y = null;
            }
        }
        ipkVar2.v.post(new ild(obj3, 7));
        ipkVar2.v.a = false;
        ipkVar2.b.g();
    }

    public fyo(fyq fyqVar, int i) {
        this.c = i;
        this.a = fyqVar;
    }

    public fyo(ipk ipkVar, int i) {
        this.c = i;
        this.a = ipkVar;
    }
}
