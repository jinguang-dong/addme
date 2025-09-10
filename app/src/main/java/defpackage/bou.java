package defpackage;

import android.view.KeyEvent;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class bou {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        return (obj instanceof bou) && a.ao(this.a, ((bou) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
