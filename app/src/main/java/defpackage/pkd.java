package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.util.Log;
import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pkd implements pju {
    private final pbn a;
    private final pbc b;
    private final ues c;
    private final mdy d;
    private final ocq e;

    public pkd(ocq ocqVar, mdy mdyVar, pbn pbnVar, pbc pbcVar) {
        mdyVar.getClass();
        pbnVar.getClass();
        this.e = ocqVar;
        this.d = mdyVar;
        this.a = pbnVar;
        this.b = pbcVar.a("VerifiedCamLstPrdr");
        this.c = new uez(new dus(this, 14));
    }

    private static final Throwable d(IllegalStateException illegalStateException) {
        Throwable cause = illegalStateException.getCause();
        if (cause instanceof CameraAccessException) {
            Throwable cause2 = illegalStateException.getCause();
            cause2.getClass();
            return (CameraAccessException) cause2;
        }
        if (!(cause instanceof IllegalArgumentException)) {
            return null;
        }
        Throwable cause3 = illegalStateException.getCause();
        cause3.getClass();
        return (IllegalArgumentException) cause3;
    }

    private final sjp e() {
        return (sjp) this.c.a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.pju
    public final List a() {
        return e().b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.pju
    public final List b() {
        return e().a;
    }

    public final sjp c() {
        List listA;
        this.a.f("verifyCameras");
        try {
            try {
                ocq ocqVar = this.e;
                Object obj = ocqVar.aQ().b;
                synchronized (((sv) obj).c) {
                    listA = ((sv) obj).d;
                }
                if (listA == null) {
                    listA = ((sv) obj).a();
                }
                if (listA == null) {
                    LmJPKwPBa.DLTayp.toString();
                    Log.w("CXCP", "Failed to load cameraIds from CameraBackendId(value=CXCP-Camera2)");
                }
                if (listA == null) {
                    listA = ufw.a;
                }
                if (listA.isEmpty()) {
                    this.b.d("No cameras available!");
                    throw new pjw();
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    String str = ((pp) it.next()).a;
                    try {
                        Set setJ = ocqVar.aL(str).j();
                        Iterator it2 = setJ.iterator();
                        while (it2.hasNext()) {
                            String str2 = ((pp) it2.next()).a;
                            if (linkedHashSet.contains(new pp(str2))) {
                                linkedHashSet.add(new pp(str));
                            } else {
                                try {
                                    this.e.aL(str2);
                                } catch (IllegalStateException e) {
                                    sdy sdyVar = new sdy(null);
                                    sdyVar.f(str2);
                                    sdyVar.a = d(e);
                                    linkedHashMap.put(str2, sdyVar.e());
                                    this.b.h(mn.f(str, str2, "Failed Physical camera Id: ", ". Failed logical camera Id: "));
                                    linkedHashSet.add(new pp(str));
                                    linkedHashSet.addAll(setJ);
                                }
                            }
                        }
                    } catch (IllegalStateException e2) {
                        sdy sdyVar2 = new sdy(null);
                        sdyVar2.f(str);
                        sdyVar2.a = d(e2);
                        linkedHashMap.put(str, sdyVar2.e());
                        linkedHashSet.add(new pp(str));
                        this.b.h(mn.g(str, "Failed logical camera Id: "));
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    this.b.h("Failed camera ids " + linkedHashMap.keySet());
                    mdy mdyVar = this.d;
                    for (pjs pjsVar : ske.bN(linkedHashMap.values())) {
                        int i = sbp.d;
                        mdyVar.t(11, null, null, 0, 0, 0, sex.a, sbp.l(pjsVar.a), pbw.b(pjsVar), false);
                    }
                }
                List listBP = ske.bP(listA);
                listBP.removeAll(linkedHashSet);
                if (listBP.isEmpty()) {
                    this.b.b("No working cameras available!");
                    throw new pjt(ske.bN(linkedHashMap.values()));
                }
                ArrayList arrayList = new ArrayList(listBP.size());
                Iterator it3 = listBP.iterator();
                while (it3.hasNext()) {
                    arrayList.add(pjr.b(((pp) it3.next()).a));
                }
                return new sjp(arrayList, ske.bN(linkedHashMap.values()));
            } catch (CameraAccessException e3) {
                this.b.b("Failed to read the camera list.");
                throw new pjv("Failed to read the camera list.", e3.getReason(), e3);
            }
        } finally {
            this.a.g();
        }
    }
}
