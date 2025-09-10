package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.camera.wear.wearappv2.ui.countdown.WearCountdownView;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ayd implements uif {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ayd(aw awVar, ViewGroup viewGroup, Object obj, uka ukaVar, int i) {
        this.e = i;
        this.a = awVar;
        this.d = viewGroup;
        this.c = obj;
        this.b = ukaVar;
    }

    /* JADX WARN: Type inference failed for: r11v21, types: [java.lang.Object, und] */
    @Override // defpackage.uif
    public final Object a() {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                return ukc.C(this.b, null, 0, new agq((WearCountdownView) this.d, (String) this.c, (abr) obj, (uhb) null, 13), 3);
            }
            aw awVar = (aw) this.a;
            cy cyVar = awVar.d;
            Object obj2 = this.c;
            Object obj3 = this.d;
            ViewGroup viewGroup = (ViewGroup) obj3;
            awVar.g = cyVar.s(viewGroup, obj2);
            if (awVar.g == null) {
                throw new IllegalStateException(mn.e((byte) 46, obj3, obj2, "Unable to start transition ", " for container "));
            }
            ((uka) this.b).a = new au(awVar, obj2, viewGroup, 1);
            if (ch.X(2)) {
                Objects.toString(awVar.b);
                Objects.toString(awVar.c);
            }
            return ufg.a;
        }
        Object obj4 = this.a;
        bbu bbuVar = ((ayg) obj4).t;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        bbt bbtVar = bbuVar.a;
        try {
            bbuVar.a = (bbt) obj7;
            bav bavVar = ((ayg) obj4).o;
            int[] iArr = ((ayg) obj4).f;
            yq yqVar = ((ayg) obj4).z;
            ((ayg) obj4).f = null;
            ((ayg) obj4).z = null;
            try {
                ((ayg) obj4).o = (bav) obj6;
                boolean z = bbuVar.c;
                try {
                    bbuVar.c = false;
                    ((ayg) obj4).al(((azq) obj5).a, ((azq) obj5).h, ((azq) obj5).b);
                    bbuVar.a = bbtVar;
                    return ufg.a;
                } finally {
                    bbuVar.c = z;
                }
            } finally {
                ((ayg) obj4).o = bavVar;
                ((ayg) obj4).f = iArr;
                ((ayg) obj4).z = yqVar;
            }
        } catch (Throwable th) {
            bbuVar.a = bbtVar;
            throw th;
        }
    }

    public /* synthetic */ ayd(ayg aygVar, bbt bbtVar, bav bavVar, azq azqVar, int i) {
        this.e = i;
        this.a = aygVar;
        this.b = bbtVar;
        this.c = bavVar;
        this.d = azqVar;
    }

    public /* synthetic */ ayd(und undVar, WearCountdownView wearCountdownView, String str, abr abrVar, int i) {
        this.e = i;
        this.b = undVar;
        this.d = wearCountdownView;
        this.c = str;
        this.a = abrVar;
    }
}
