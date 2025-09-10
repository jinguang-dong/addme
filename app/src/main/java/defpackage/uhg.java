package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uhg implements Serializable, uhf {
    public static final uhg a = new uhg();
    private static final long serialVersionUID = 0;

    private uhg() {
    }

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.uhf
    public final uhd get(uhe uheVar) {
        uheVar.getClass();
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.uhf
    public final uhf minusKey(uhe uheVar) {
        uheVar.getClass();
        return this;
    }

    @Override // defpackage.uhf
    public final uhf plus(uhf uhfVar) {
        uhfVar.getClass();
        return uhfVar;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.uhf
    public final Object fold(Object obj, uiu uiuVar) {
        return obj;
    }
}
