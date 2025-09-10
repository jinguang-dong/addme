package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aud implements uiu {
    private final /* synthetic */ int a;

    public /* synthetic */ aud(int i) {
        this.a = i;
    }

    @Override // defpackage.uiu
    public final Object a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return new asp();
            case 1:
                return (ask) ((dgk) ((ejs) obj2).a).b();
            case 2:
                dlh dlhVar = (dlh) obj2;
                bgb bgbVar = dlh.h;
                return rnt.ae(new Integer[]{Integer.valueOf(dlhVar.f()), Integer.valueOf(dlhVar.g())});
            case 3:
                dme dmeVar = (dme) obj2;
                bgb bgbVar2 = dme.l;
                return rnt.ae(new Integer[]{Integer.valueOf(dmeVar.f()), Integer.valueOf(dmeVar.g())});
            case 4:
                Map mapB = ((dnb) obj2).b();
                if (mapB.isEmpty()) {
                    return null;
                }
                return mapB;
            case 5:
                chx.v((ebn) obj, (String) obj2);
                return ufg.a;
            case 6:
                ((nkx) obj).getClass();
                ((nkx) obj2).getClass();
                return new asv();
            case 7:
                ebn ebnVar = (ebn) obj;
                String str = (String) obj2;
                ebnVar.getClass();
                str.getClass();
                chx.v(ebnVar, str);
                return ufg.a;
            case 8:
                String str2 = (String) obj;
                uhd uhdVar = (uhd) obj2;
                str2.getClass();
                uhdVar.getClass();
                if (str2.length() == 0) {
                    return uhdVar.toString();
                }
                return str2 + ", " + uhdVar;
            default:
                uhf uhfVar = (uhf) obj;
                uhd uhdVar2 = (uhd) obj2;
                return uhdVar2 instanceof umv ? uhfVar.plus(((umv) uhdVar2).a()) : uhfVar.plus(uhdVar2);
        }
    }
}
