package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffl extends owx {
    public final String a;
    private final hbj b;

    public ffl(String str, owq owqVar, hbj hbjVar) {
        super(owqVar);
        this.a = str;
        this.b = hbjVar;
    }

    @Override // defpackage.owx
    public final /* synthetic */ Object b(Object obj) {
        gzi gziVar = gyg.a;
        ffp ffpVar = new ffp();
        for (String str : ((String) obj).split("\\|")) {
            try {
                ffpVar.c(Float.parseFloat(str));
            } catch (NumberFormatException unused) {
            }
        }
        return ffpVar;
    }

    @Override // defpackage.owx
    protected final /* synthetic */ Object c(Object obj) {
        ffp ffpVar = (ffp) obj;
        gzi gziVar = gyg.a;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ffpVar.b(); i++) {
            sb.append(ffpVar.a(i));
            sb.append("|");
        }
        return sb.toString();
    }
}
