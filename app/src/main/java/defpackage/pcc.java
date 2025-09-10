package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pcc extends Exception {
    public final pbw a;
    public final pjr b;
    public final boolean c;

    public pcc(pjr pjrVar, pbw pbwVar, boolean z) {
        String str = pjrVar.a;
        String strC = pbwVar.c();
        StringBuilder sb = new StringBuilder("Camera ");
        sb.append(str);
        sb.append(" encountered a fatal error ");
        sb.append(true != z ? "before opening: " : "after open: ");
        sb.append(strC);
        super(sb.toString());
        this.b = pjrVar;
        this.a = pbwVar;
        this.c = z;
    }
}
