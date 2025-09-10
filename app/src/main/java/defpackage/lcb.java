package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class lcb implements rvu {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    private final /* synthetic */ int c;

    public /* synthetic */ lcb(float f, float f2, int i) {
        this.c = i;
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.rvu
    public final Object apply(Object obj) {
        if (this.c == 0) {
            return Float.valueOf(Math.max(this.a, Math.min(this.b, ((Float) obj).floatValue())));
        }
        Float f = (Float) obj;
        boolean z = false;
        if (f.floatValue() >= this.a) {
            if (f.floatValue() <= this.b) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
