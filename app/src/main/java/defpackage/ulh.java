package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ulh implements uli {
    public final uif a;
    public final uiq b;

    public ulh(uif uifVar, uiq uiqVar) {
        this.a = uifVar;
        this.b = uiqVar;
    }

    @Override // defpackage.uli
    public final Iterator a() {
        return new ulg(this);
    }
}
