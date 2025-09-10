package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.rectiface.Iqz.mPfBwqXsnpXI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dh {
    public final ViewGroup a;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;
    public boolean e;
    private boolean f;

    public dh(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public static final dh c(ViewGroup viewGroup, ch chVar) {
        viewGroup.getClass();
        byi byiVarAi = chVar.ai();
        byiVarAi.getClass();
        return e.y(viewGroup, byiVarAi);
    }

    private final void k() {
        for (dg dgVar : this.b) {
            if (dgVar.i == 2) {
                dgVar.h(a.aW(dgVar.a.requireView().getVisibility()), 1);
            }
        }
    }

    private final void l(Map map, View view) {
        int[] iArr = con.a;
        String strE = cog.e(view);
        if (strE != null) {
            map.put(strE, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    childAt.getClass();
                    l(map, childAt);
                }
            }
        }
    }

    private static void m(yd ydVar, Collection collection) {
        Set setEntrySet = ydVar.entrySet();
        sh shVar = new sh(collection, 1);
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (!((Boolean) shVar.a(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    public final dg a(bm bmVar) {
        Object next;
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            dg dgVar = (dg) next;
            if (a.ao(dgVar.a, bmVar) && !dgVar.b) {
                break;
            }
        }
        return (dg) next;
    }

    public final dg b(bm bmVar) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            dg dgVar = (dg) next;
            if (a.ao(dgVar.a, bmVar) && !dgVar.b) {
                break;
            }
        }
        return (dg) next;
    }

    public final void d(dg dgVar) {
        dgVar.getClass();
        if (dgVar.f) {
            int i = dgVar.h;
            bm bmVar = dgVar.a;
            a.aV(i, bmVar.requireView(), this.a);
            dgVar.g();
        }
    }

    public final void e(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ske.bT(arrayList, ((dg) it.next()).g);
        }
        List listBN = ske.bN(ske.bQ(arrayList));
        int size = listBN.size();
        for (int i = 0; i < size; i++) {
            ((de) listBN.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            d((dg) list.get(i2));
        }
        List listBN2 = ske.bN(list);
        int size3 = listBN2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            dg dgVar = (dg) listBN2.get(i3);
            if (dgVar.g.isEmpty()) {
                dgVar.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0403 A[Catch: all -> 0x055f, LOOP:25: B:165:0x03fd->B:167:0x0403, LOOP_END, TryCatch #0 {, blocks: (B:11:0x0019, B:12:0x0026, B:14:0x002d, B:16:0x0039, B:20:0x0041, B:21:0x0044, B:22:0x0048, B:24:0x004f, B:26:0x0059, B:28:0x005f, B:29:0x0062, B:34:0x0072, B:36:0x0078, B:30:0x0066, B:32:0x006c, B:33:0x006f, B:37:0x007c, B:39:0x0082, B:41:0x008f, B:42:0x009b, B:44:0x00a1, B:46:0x00b5, B:50:0x00bb, B:51:0x00c6, B:53:0x00cc, B:55:0x00e0, B:59:0x00e6, B:61:0x00ef, B:62:0x00f5, B:63:0x010b, B:65:0x0111, B:66:0x0134, B:67:0x013c, B:69:0x0142, B:76:0x015c, B:77:0x016b, B:78:0x0174, B:80:0x017a, B:82:0x0187, B:83:0x018b, B:84:0x0194, B:86:0x019a, B:88:0x01a7, B:89:0x01ab, B:90:0x01b1, B:92:0x01b7, B:96:0x01c6, B:97:0x01ef, B:168:0x040f, B:169:0x041d, B:171:0x0423, B:172:0x0431, B:173:0x043a, B:175:0x0440, B:177:0x0455, B:179:0x0459, B:180:0x045d, B:182:0x0467, B:184:0x046d, B:185:0x0471, B:187:0x0476, B:188:0x0479, B:189:0x0483, B:190:0x0487, B:192:0x048d, B:194:0x0499, B:196:0x049f, B:198:0x04a5, B:200:0x04ab, B:201:0x04af, B:202:0x04b8, B:204:0x04bd, B:206:0x04c3, B:208:0x04d1, B:211:0x04d8, B:212:0x04dc, B:214:0x04e2, B:218:0x04f2, B:219:0x04fb, B:221:0x0501, B:222:0x050d, B:226:0x0516, B:227:0x051b, B:229:0x0521, B:234:0x0534, B:236:0x0538, B:241:0x0557, B:238:0x0541, B:240:0x054b, B:101:0x01fa, B:102:0x0227, B:104:0x022d, B:108:0x023f, B:110:0x026c, B:112:0x0279, B:113:0x0280, B:114:0x0285, B:116:0x028b, B:118:0x02a6, B:120:0x02b5, B:121:0x02d9, B:123:0x02e3, B:124:0x02ea, B:126:0x02f0, B:127:0x02f7, B:128:0x02fe, B:130:0x0304, B:131:0x030b, B:133:0x0318, B:135:0x031e, B:136:0x0321, B:137:0x0322, B:139:0x033d, B:141:0x0343, B:142:0x0346, B:143:0x0347, B:145:0x0351, B:147:0x035d, B:148:0x0360, B:149:0x0363, B:151:0x0377, B:117:0x0299, B:157:0x03c6, B:159:0x03cc, B:160:0x03d0, B:162:0x03d6, B:164:0x03e0, B:165:0x03fd, B:167:0x0403), top: B:250:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0515  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 1378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh.f():void");
    }

    public final void h() {
        Object objPrevious;
        bi biVar;
        List list = this.b;
        synchronized (list) {
            k();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                dg dgVar = (dg) objPrevious;
                View view = dgVar.a.P;
                view.getClass();
                int iAX = a.aX(view);
                if (dgVar.h == 2 && iAX != 2) {
                    break;
                }
            }
            dg dgVar2 = (dg) objPrevious;
            bm bmVar = dgVar2 != null ? dgVar2.a : null;
            boolean z = false;
            if (bmVar != null && (biVar = bmVar.S) != null) {
                z = biVar.s;
            }
            this.e = z;
        }
    }

    public final void i(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((dg) list.get(i)).b();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ske.bT(arrayList, ((dg) it.next()).g);
        }
        List listBN = ske.bN(ske.bQ(arrayList));
        int size2 = listBN.size();
        for (int i2 = 0; i2 < size2; i2++) {
            de deVar = (de) listBN.get(i2);
            ViewGroup viewGroup = this.a;
            if (!deVar.h) {
                deVar.c(viewGroup);
            }
            deVar.h = true;
        }
    }

    public final void j(int i, int i2, cn cnVar) {
        List list = this.b;
        synchronized (list) {
            bm bmVar = cnVar.a;
            bmVar.getClass();
            dg dgVarA = a(bmVar);
            if (dgVarA == null) {
                if (bmVar.s) {
                    bmVar.getClass();
                    dgVarA = b(bmVar);
                } else {
                    dgVarA = null;
                }
            }
            if (dgVarA != null) {
                dgVarA.h(i, i2);
                return;
            }
            df dfVar = new df(i, i2, cnVar);
            list.add(dfVar);
            dfVar.c(new at(this, dfVar, 5));
            dfVar.c(new at(this, dfVar, 6));
        }
    }

    public final void g() {
        ViewGroup viewGroup = this.a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        List list = this.b;
        synchronized (list) {
            k();
            i(list);
            List<dg> listBP = ske.bP(this.c);
            Iterator it = listBP.iterator();
            while (it.hasNext()) {
                ((dg) it.next()).d = false;
            }
            for (dg dgVar : listBP) {
                if (ch.X(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(mPfBwqXsnpXI.hvnjbQGiYZXgJz);
                        sb.append(viewGroup);
                        sb.append(" is not attached to window. ");
                    }
                    Objects.toString(dgVar);
                }
                dgVar.e(viewGroup);
            }
            List<dg> listBP2 = ske.bP(list);
            Iterator it2 = listBP2.iterator();
            while (it2.hasNext()) {
                ((dg) it2.next()).d = false;
            }
            for (dg dgVar2 : listBP2) {
                if (ch.X(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(viewGroup);
                        sb2.append(" is not attached to window. ");
                    }
                    Objects.toString(dgVar2);
                }
                dgVar2.e(viewGroup);
            }
        }
    }
}
