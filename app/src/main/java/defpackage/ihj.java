package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ihj implements rvu {
    public final /* synthetic */ float a;
    private final /* synthetic */ int b;

    public /* synthetic */ ihj(float f, int i) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return Boolean.valueOf(((Float) obj).floatValue() >= this.a);
        }
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
        float fFloatValue = ((Float) list.get(2)).floatValue();
        jjq jjqVar = (jjq) list.get(3);
        return Boolean.valueOf((!zBooleanValue || zBooleanValue2 || jjqVar.f.isPresent() || jjqVar.g.isPresent() || fFloatValue == -999.0f || fFloatValue > this.a) ? false : true);
    }
}
