package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ulq implements uli {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public ulq(CharSequence charSequence, uiu uiuVar, int i) {
        this.c = i;
        this.a = charSequence;
        this.b = uiuVar;
    }

    @Override // defpackage.uli
    public final Iterator a() {
        return this.c != 0 ? new uln(this) : new ulp(this);
    }

    public ulq(uli uliVar, uiq uiqVar, int i) {
        this.c = i;
        this.b = uliVar;
        this.a = uiqVar;
    }
}
