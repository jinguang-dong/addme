package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfy implements bfx {
    private final uiq a;
    private final zu b;
    private zu c;

    public bfy(Map map, uiq uiqVar) {
        this.a = uiqVar;
        zu zuVar = null;
        if (map != null && !map.isEmpty()) {
            zuVar = new zu(map.size());
            for (Map.Entry entry : map.entrySet()) {
                zuVar.j(entry.getKey(), entry.getValue());
            }
        }
        this.b = zuVar;
    }

    @Override // defpackage.bfx
    public final Object a(String str) {
        zu zuVar = this.b;
        List list = zuVar != null ? (List) zuVar.g(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            List listSubList = list.subList(1, list.size());
            int iF = zuVar.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = zuVar.c;
            Object obj = objArr[iF];
            zuVar.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // defpackage.bfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map b() {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfy.b():java.util.Map");
    }

    @Override // defpackage.bfx
    public final boolean e(Object obj) {
        return ((Boolean) this.a.a(obj)).booleanValue();
    }

    @Override // defpackage.bfx
    public final nki f(String str, uif uifVar) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!ujp.I(str.charAt(i))) {
                zu zuVar = this.c;
                if (zuVar == null) {
                    long[] jArr = zv.a;
                    zuVar = new zu((byte[]) null);
                    this.c = zuVar;
                }
                Object objA = zuVar.a(str);
                if (objA == null) {
                    objA = new ArrayList();
                    zuVar.j(str, objA);
                }
                ((List) objA).add(uifVar);
                return new nki(zuVar, str, uifVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }
}
