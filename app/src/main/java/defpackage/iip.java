package defpackage;

import com.google.android.libraries.vision.opengl.Texture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iip implements ilb {
    private final sbp a;

    public iip(sbp sbpVar) {
        this.a = sbpVar;
    }

    @Override // defpackage.ilb
    public final void a(float[] fArr, long j) {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return;
            }
            ((ilb) sbpVar.get(i)).a(fArr, j);
            i++;
        }
    }

    @Override // defpackage.ilb
    public final void b(int i, int i2) {
        int i3 = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i3 >= ((sex) sbpVar).c) {
                return;
            }
            ((ilb) sbpVar.get(i3)).b(i, i2);
            i3++;
        }
    }

    @Override // defpackage.ilb
    public final void c(Texture texture, ila ilaVar) {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return;
            }
            ((ilb) sbpVar.get(i)).c(texture, ilaVar);
            i++;
        }
    }

    @Override // defpackage.ilb
    public final void d() {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return;
            }
            ((ilb) sbpVar.get(i)).d();
            i++;
        }
    }

    @Override // defpackage.ilb
    public final void e(iiu iiuVar) {
        int i = 0;
        while (true) {
            sbp sbpVar = this.a;
            if (i >= ((sex) sbpVar).c) {
                return;
            }
            ((ilb) sbpVar.get(i)).e(iiuVar);
            i++;
        }
    }
}
