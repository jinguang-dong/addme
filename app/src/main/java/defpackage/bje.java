package defpackage;

import android.view.DragEvent;
import android.view.View;
import defpackage.bij;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bje implements View.OnDragListener {
    public final bjg a = new bjg(null);
    public final yf b = new yf(null);
    public final bik c = new bwa() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.bwa
        public final /* bridge */ /* synthetic */ bij a() {
            return this.a.a;
        }

        @Override // defpackage.bwa
        public final /* bridge */ /* synthetic */ void b(bij bijVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.a.a.hashCode();
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        ejs ejsVar = new ejs(dragEvent, (byte[]) null);
        switch (dragEvent.getAction()) {
            case 1:
                bjg bjgVar = this.a;
                ujw ujwVar = new ujw();
                kk.k(bjgVar, new aaw(ujwVar, 3));
                boolean z = ujwVar.a;
                ye yeVar = new ye(this.b);
                while (yeVar.hasNext()) {
                }
                break;
            case 2:
                this.a.e(ejsVar);
                break;
            case 4:
                kk.k(this.a, new aap(2));
                this.b.clear();
            case 3:
                return false;
            case 6:
                this.a.d(ejsVar);
            case 5:
                return false;
        }
        return false;
    }
}
