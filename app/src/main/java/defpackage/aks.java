package defpackage;

import j$.util.Collection;
import java.io.File;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aks implements uiq {
    private final /* synthetic */ int a;

    public /* synthetic */ aks(int i) {
        this.a = i;
    }

    @Override // defpackage.uiq
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return ufg.a;
            case 1:
                return Boolean.valueOf(!a.p(((bpv) obj).i, 2));
            case 2:
                return ufg.a;
            case 3:
                return ufg.a;
            case 4:
                List list = (List) obj;
                return new ank(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 5:
                uld[] uldVarArr = cbw.a;
                cbz cbzVar = cbu.e;
                ufg ufgVar = ufg.a;
                ((cbn) obj).e(cbzVar, ufgVar);
                return ufgVar;
            case 6:
                return ufg.a;
            case 7:
                return new bfv((Map) obj);
            case 8:
                return obj;
            case 9:
                synchronized (bgr.b) {
                    List list2 = bgr.g;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((uiq) list2.get(i)).a(obj);
                    }
                }
                return ufg.a;
            case 10:
                uiq uiqVar = bgr.a;
                return ufg.a;
            case 11:
                File file = (File) obj;
                Set set = cry.a;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new tdy();
            case 12:
                dey deyVar = (dey) obj;
                int i2 = ddi.h;
                deyVar.getClass();
                ugw ugwVar = new ugw();
                while (deyVar.j()) {
                    ugwVar.add(Integer.valueOf((int) deyVar.b(0)));
                }
                return ske.aU(ugwVar);
            case 13:
                ddw ddwVarA = ((ddo) obj).a("DELETE FROM EnumerationErrorCounts");
                try {
                    ddwVarA.j();
                    ddwVarA.close();
                    return null;
                } catch (Throwable th) {
                    ddwVarA.close();
                    throw th;
                }
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return a.ab((cbn) obj);
            case 15:
                return a.ab((cbn) obj);
            case 16:
                String str = (String) obj;
                int i3 = gwv.Y;
                str.getClass();
                return Collection.EL.stream(ujp.A(str, new String[]{","}));
            case 17:
                String str2 = (String) obj;
                int i4 = gwv.Y;
                str2.getClass();
                return Float.valueOf(Float.parseFloat(str2));
            case 18:
                ((ncn) obj).getClass();
                return new EnumMap(ncn.class);
            case 19:
                return a.ab((cbn) obj);
            default:
                ((cqt) obj).getClass();
                tpc tpcVarM = rba.a.m();
                tpcVarM.getClass();
                return qpt.af(tpcVarM);
        }
    }
}
