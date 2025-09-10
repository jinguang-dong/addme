package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqj {
    public final Object a;
    public final azr b;
    public uiu c = null;

    public dqj(Object obj, azr azrVar) {
        this.a = obj;
        this.b = azrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqj)) {
            return false;
        }
        dqj dqjVar = (dqj) obj;
        if (!a.ao(this.a, dqjVar.a) || !a.ao(this.b, dqjVar.b)) {
            return false;
        }
        uiu uiuVar = dqjVar.c;
        return a.ao(null, null);
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "ScreenContent(key=" + this.a + ", scrollInfoProvider=" + this.b + ", timeText=null)";
    }
}
