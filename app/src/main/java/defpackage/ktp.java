package defpackage;

import com.google.android.apps.camera.coach.CameraCoachHudView;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ktp implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object, moc] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void d(Object obj) {
        switch (this.b) {
            case 0:
                ((kto) obj).i((ksa) this.a);
                return;
            case 1:
                ((krj) this.a).u.A((krs) obj);
                return;
            case 2:
                kto ktoVar = (kto) obj;
                ktoVar.h((String) this.a);
                ktoVar.setEnabled(false);
                return;
            case 3:
                ((pfu) this.a).l((pej) obj);
                return;
            case 4:
                ((pep) this.a).d(((Integer) obj).intValue());
                return;
            case 5:
                float fFloatValue = ((Float) obj).floatValue();
                tpc tpcVar = (tpc) this.a;
                if (!tpcVar.b.C()) {
                    tpcVar.o();
                }
                srt srtVar = (srt) tpcVar.b;
                srt srtVar2 = srt.a;
                srtVar.b |= 2;
                srtVar.d = fFloatValue;
                return;
            case 6:
                this.a.j((Supplier) obj);
                return;
            case 7:
                int i = mud.i;
                ((mtw) obj).d((String) this.a);
                return;
            case 8:
                ((myd) this.a).x(((Integer) obj).intValue());
                return;
            case 9:
                ((myd) this.a).u(((Integer) obj).intValue());
                return;
            case 10:
                ((myd) this.a).L(((Integer) obj).intValue());
                return;
            case 11:
                Object obj2 = this.a;
                qqq qqqVar = (qqq) obj2;
                nkw nkwVar = (nkw) obj;
                owf owfVar = (owf) ((sbv) qqqVar.d).get(nkwVar);
                if (owfVar != null) {
                    ((our) qqqVar.e).d(owfVar.dK(new leg(obj2, nkwVar, 9), sxo.a));
                    return;
                }
                return;
            case 12:
                ((ngd) this.a).c.d((ngo) obj);
                return;
            case 13:
                Object obj3 = this.a;
                ngo ngoVar = (ngo) obj;
                synchronized (((ngk) obj3).b) {
                    ((ngk) obj3).i = rwc.j(ngoVar);
                }
                return;
            default:
                int iIntValue = ((Integer) obj).intValue();
                CameraCoachHudView cameraCoachHudView = (CameraCoachHudView) this.a;
                if (cameraCoachHudView.d.h()) {
                    ((gua) cameraCoachHudView.d.c()).o = iIntValue;
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
