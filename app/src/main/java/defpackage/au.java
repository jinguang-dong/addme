package defpackage;

import android.graphics.Typeface;
import android.text.format.DateFormat;
import android.view.ViewGroup;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.extensions.core.util.function.Consumer;
import com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class au implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ au(ago agoVar, ajs ajsVar, agi agiVar, int i) {
        this.d = i;
        this.c = agoVar;
        this.a = ajsVar;
        this.b = agiVar;
    }

    public /* synthetic */ au(aw awVar, Object obj, ViewGroup viewGroup, int i) {
        this.d = i;
        this.b = awVar;
        this.a = obj;
        this.c = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, uif] */
    /* JADX WARN: Type inference failed for: r0v22, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [azr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [agi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [bry, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [androidx.window.extensions.core.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [bdg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v26, types: [androidx.window.extensions.core.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v32, types: [azr, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        ago agoVar;
        bkg bkgVarE;
        byte[] bArr = null;
        switch (this.d) {
            case 0:
                ((aw) this.b).d.f((ViewGroup) this.c, this.a);
                return ufg.a;
            case 1:
                Object obj = this.b;
                aw awVar = (aw) obj;
                List list = awVar.a;
                if (list.isEmpty()) {
                    Object obj2 = this.c;
                    cy cyVar = awVar.d;
                    Object obj3 = awVar.g;
                    obj3.getClass();
                    cyVar.u(obj3, new at(obj, obj2, 4, bArr));
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((ax) it.next()).a.d) {
                            Object obj4 = this.a;
                            cmp cmpVar = new cmp();
                            cy cyVar2 = awVar.d;
                            dg dgVar = ((ax) list.get(0)).a;
                            cyVar2.r(obj4, cmpVar, new av(obj, 2));
                            cmpVar.a();
                        }
                    }
                    Object obj22 = this.c;
                    cy cyVar3 = awVar.d;
                    Object obj32 = awVar.g;
                    obj32.getClass();
                    cyVar3.u(obj32, new at(obj, obj22, 4, bArr));
                }
                return ufg.a;
            case 2:
                break;
            case 3:
                ?? r0 = this.a;
                ?? r1 = this.c;
                apt aptVar = (apt) this.b;
                bkg bkgVarC = apt.c(aptVar, r1, r0);
                if (bkgVarC == null) {
                    return null;
                }
                ago agoVar2 = aptVar.a;
                if (a.q(agoVar2.g, 0L)) {
                    akg.c(VnmwoBe.EfLNApf);
                }
                return bkgVarC.e(agoVar2.d(bkgVarC, agoVar2.g) ^ (-9223372034707292160L));
            case 4:
                Object obj5 = this.c;
                Object obj6 = this.b;
                if (obj6 != null) {
                    baz bazVar = (baz) obj5;
                    bazVar.x(bazVar.a((axq) obj6) - bazVar.o);
                }
                baz bazVar2 = (baz) obj5;
                List listM = bad.m(bazVar2, bazVar2.o, null);
                if (((bhs) ske.bG(listM)) == null) {
                    return ske.bJ(listM, this.a.a());
                }
                throw null;
            case 5:
                Object obj7 = this.a;
                if (obj7 == null) {
                    obj7 = cfp.e;
                }
                return (Typeface) ((qqq) this.c).J((cfd) this.b, (cfp) obj7).a();
            case 6:
                Calendar calendar = (Calendar) this.b.a();
                calendar.setTimeInMillis(((bbf) this.c).e());
                return DateFormat.format((CharSequence) this.a, calendar).toString();
            case 7:
                WindowAreaComponent windowAreaComponent = ((dtw) this.b).c;
                windowAreaComponent.removeRearDisplayStatusListener((Consumer) this.c);
                windowAreaComponent.removeRearDisplayPresentationStatusListener((Consumer) this.a);
                return ufg.a;
            case 8:
                this.b.b(null);
                if (!((Boolean) this.c.a()).booleanValue()) {
                    ((gwv) this.a).t.b(false);
                }
                return ufg.a;
            default:
                jsv.N(this.a, true);
                ?? r02 = this.b;
                if (r02 != 0) {
                    r02.b(true);
                }
                this.c.b(null);
                return ufg.a;
        }
        while (true) {
            agoVar = (ago) this.c;
            bdp bdpVar = (bdp) agoVar.i.a;
            int i = bdpVar.b;
            if (i != 0) {
                if (i == 0) {
                    bdp.q();
                    throw new uer();
                }
                Object objA = ((agl) bdpVar.a[i - 1]).a.a();
                if (objA == null || agoVar.l((bkg) objA, agoVar.g)) {
                    ((agl) bdpVar.c(bdpVar.b - 1)).b.fW(ufg.a);
                }
            }
        }
        if (agoVar.e && (bkgVarE = agoVar.e()) != null && agoVar.l(bkgVarE, agoVar.g)) {
            agoVar.e = false;
        }
        ((ajs) this.a).e = agoVar.c(this.b);
        return ufg.a;
    }

    public /* synthetic */ au(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ au(String str, azr azrVar, bbf bbfVar, int i) {
        this.d = i;
        this.a = str;
        this.b = azrVar;
        this.c = bbfVar;
    }

    public /* synthetic */ au(qqq qqqVar, cfd cfdVar, cfp cfpVar, int i) {
        this.d = i;
        this.c = qqqVar;
        this.b = cfdVar;
        this.a = cfpVar;
    }
}
