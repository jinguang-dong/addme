package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpa {
    public final gpf a;
    public int b;
    public int c;
    public int d;

    public gpa(gpf gpfVar) {
        this.a = gpfVar;
    }

    public final String toString() {
        rwb rwbVarW = rnt.W(this);
        rwbVarW.b("Reason", this.a);
        rwbVarW.e("Impressions before reboot", this.b);
        rwbVarW.e("Impressions after reboot", this.c);
        rwbVarW.e("Reboot count", this.d);
        return rwbVarW.toString();
    }
}
