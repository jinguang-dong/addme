package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tas extends sjg {
    private final sbp a;

    public tas(String str, sbp sbpVar) {
        super(str);
        this.a = sbpVar;
    }

    @Override // defpackage.sif
    public final void c(sid sidVar) {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return;
            }
            sif sifVar = (sif) sbpVar.get(i);
            if (sidVar.K() || sifVar.d(sidVar.o())) {
                sifVar.c(sidVar);
            }
            i++;
        }
    }

    @Override // defpackage.sif
    public final boolean d(Level level) {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return false;
            }
            if (((sif) sbpVar.get(i)).d(level)) {
                return true;
            }
            i++;
        }
    }
}
