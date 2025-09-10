package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nex implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nex(bfr bfrVar, bgb bgbVar, bfx bfxVar, String str, Object obj, Object[] objArr, int i) {
        this.g = i;
        this.d = bfrVar;
        this.e = bgbVar;
        this.f = bfxVar;
        this.b = str;
        this.c = obj;
        this.a = objArr;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, uiu] */
    /* JADX WARN: Type inference failed for: r5v3, types: [bfx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [aby, java.lang.Object] */
    @Override // defpackage.uif
    public final Object a() {
        boolean z = false;
        boolean z2 = true;
        if (this.g == 0) {
            ?? r7 = this.f;
            Object obj = this.e;
            Object obj2 = this.c;
            ukc.C(this.a, null, 0, new agq((aus) obj, (nkx) obj2, (aby) r7, (uhb) null, 12), 3);
            this.b.a(obj2, true);
            ((View) this.d).performHapticFeedback(6);
            return ufg.a;
        }
        bfr bfrVar = (bfr) this.d;
        bfx bfxVar = bfrVar.a;
        ?? r5 = this.f;
        if (bfxVar != r5) {
            bfrVar.a = r5;
            z = true;
        }
        Object obj3 = this.b;
        if (a.ao(bfrVar.b, obj3)) {
            z2 = z;
        } else {
            bfrVar.b = (String) obj3;
        }
        Object obj4 = this.a;
        Object obj5 = this.c;
        bfrVar.e = (bgb) this.e;
        bfrVar.c = obj5;
        bfrVar.d = (Object[]) obj4;
        nki nkiVar = bfrVar.f;
        if (nkiVar != null && z2) {
            nkiVar.a();
            bfrVar.f = null;
            bfrVar.d();
        }
        return ufg.a;
    }

    public /* synthetic */ nex(und undVar, uiu uiuVar, nkx nkxVar, View view, aus ausVar, aby abyVar, int i) {
        this.g = i;
        this.a = undVar;
        this.b = uiuVar;
        this.c = nkxVar;
        this.d = view;
        this.e = ausVar;
        this.f = abyVar;
    }
}
