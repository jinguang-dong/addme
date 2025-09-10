package defpackage;

import android.hardware.camera2.params.Face;
import java.util.HashMap;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hib implements pau {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ hib(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r10v76, types: [java.lang.Object, owq] */
    @Override // defpackage.pau
    public final void a(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                hie hieVar = (hie) this.a;
                hieVar.i(zBooleanValue);
                hiq hiqVar = hieVar.j;
                rnt.x(hiqVar);
                hiqVar.k.a(Boolean.valueOf(!r11.booleanValue()));
                return;
            case 1:
                if (((Boolean) obj).booleanValue()) {
                    ((hie) this.a).f(true);
                    return;
                }
                return;
            case 2:
                ((hjy) this.a).d();
                return;
            case 3:
                ((hjy) this.a).d();
                return;
            case 4:
                Boolean bool = (Boolean) obj;
                Object obj2 = this.a;
                synchronized (obj2) {
                    if (bool.booleanValue()) {
                        ((hko) obj2).h();
                        ((hko) obj2).d();
                        ((hko) obj2).c(false);
                    } else if (((hko) obj2).a) {
                        ((hko) obj2).c(true);
                        ((hko) obj2).e();
                    }
                }
                return;
            case 5:
                Boolean bool2 = (Boolean) obj;
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (bool2.booleanValue()) {
                        ((hko) obj3).f(false);
                    }
                }
                return;
            case 6:
                ((hrv) this.a).m();
                return;
            case 7:
                ((hrv) this.a).m();
                return;
            case 8:
                ((hrv) this.a).m();
                return;
            case 9:
                ((hrv) this.a).m();
                return;
            case 10:
                ((hrv) this.a).m();
                return;
            case 11:
                ((hrv) this.a).m();
                return;
            case 12:
                ((hrv) this.a).m();
                return;
            case 13:
                scn scnVar = hrw.a;
                ((hrv) ((rwg) this.a).a).n((Boolean) obj);
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                hwf hwfVar = (hwf) this.a;
                Boolean bool3 = (Boolean) obj;
                if (((Integer) ((ovx) hwfVar.b).d).intValue() == 0) {
                    hwfVar.a.a(false);
                    return;
                } else {
                    if (hwfVar.c != bool3.booleanValue()) {
                        hwfVar.c = bool3.booleanValue();
                        hwfVar.b();
                        return;
                    }
                    return;
                }
            case 15:
                if (((Boolean) obj).booleanValue()) {
                    hwb hwbVar = (hwb) this.a;
                    hwbVar.a();
                    hwbVar.j.aw((nkw) hwbVar.a.dL());
                    hwbVar.n = -1L;
                    hwbVar.b.a(false);
                    return;
                }
                return;
            case 16:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj4 = this.a;
                if (zBooleanValue2) {
                    hwb hwbVar2 = (hwb) obj4;
                    owf owfVar = hwbVar2.a;
                    if (((nkw) owfVar.dL()).equals(nkw.PHOTO) && !((Boolean) hwbVar2.f.dL()).booleanValue()) {
                        if (((Boolean) hwbVar2.h.dL()).booleanValue() || ((Boolean) hwbVar2.g.b.dL()).booleanValue()) {
                            return;
                        }
                        if (((nkw) owfVar.dL()).ordinal() != 1) {
                            throw new IllegalArgumentException("squad is not supported in mode ".concat(String.valueOf(String.valueOf(owfVar.dL()))));
                        }
                        hwbVar2.j.l();
                        return;
                    }
                }
                hwb hwbVar3 = (hwb) obj4;
                if (((Boolean) hwbVar3.f.dL()).booleanValue()) {
                    return;
                }
                ndj ndjVar = hwbVar3.j;
                if (ndjVar.b().d().equals(ncn.SQUAD_IDLE)) {
                    ndjVar.aw((nkw) hwbVar3.a.dL());
                    return;
                }
                return;
            case 17:
                List list = (List) obj;
                nkw nkwVar = (nkw) list.get(0);
                Boolean bool4 = (Boolean) list.get(1);
                Object obj5 = this.a;
                if (nkwVar != nkw.PHOTO) {
                    hwb hwbVar4 = (hwb) obj5;
                    if (((Boolean) hwbVar4.f.dL()).booleanValue()) {
                        hwbVar4.a();
                    }
                }
                if (bool4.booleanValue()) {
                    hwb hwbVar5 = (hwb) obj5;
                    if (((Boolean) hwbVar5.f.dL()).booleanValue()) {
                        hwbVar5.b();
                    }
                    hwbVar5.e.a(false);
                    return;
                }
                return;
            case 18:
                qrx qrxVar = (qrx) obj;
                HashMap map = new HashMap();
                Face[] faceArr = (Face[]) qrxVar.d;
                int length = faceArr.length;
                while (true) {
                    Object obj6 = this.a;
                    if (i >= length) {
                        ((hzq) obj6).b = map;
                        return;
                    }
                    Face face = faceArr[i];
                    Long l = (Long) ((hzq) obj6).b.get(Integer.valueOf(face.getId()));
                    map.put(Integer.valueOf(face.getId()), Long.valueOf((l != null ? l.longValue() : 0L) + qrxVar.a));
                    i++;
                }
            case 19:
                List list2 = (List) obj;
                float fFloatValue = ((Float) list2.get(0)).floatValue();
                hwz hwzVar = (hwz) list2.get(1);
                ?? r10 = this.a;
                r10.a(Boolean.valueOf(fFloatValue != -999.0f && fFloatValue < (((Boolean) r10.dL()).booleanValue() ? hwzVar.b : hwzVar.a)));
                return;
            default:
                if (((juk) obj).c) {
                    fqy fqyVar = ((iyu) this.a).K;
                    rnt.x(fqyVar);
                    fqyVar.s();
                    return;
                }
                return;
        }
    }
}
