package defpackage;

import android.graphics.Bitmap;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.SpatialGainMap;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Phaser;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ivq extends ldi {
    private static final sgv u = sgv.g("ivq");
    public boolean a;
    public final iby b;
    public final paq c;
    public final iwt d;
    public final int e;
    public final UUID f;
    public final Phaser g;
    public final int h;
    public Bitmap i;
    public thv j;
    private final ArrayList v;
    private final hkk w;

    public ivq(hkk hkkVar, gga ggaVar, hxu hxuVar, BurstSpec burstSpec, poe poeVar, iby ibyVar, paq paqVar, iwt iwtVar, int i) {
        super(ggaVar, hxuVar, burstSpec, poeVar);
        this.b = ibyVar;
        this.h = ibyVar.a();
        this.c = paqVar;
        this.d = iwtVar;
        this.e = i;
        this.f = UUID.randomUUID();
        this.a = false;
        this.g = new Phaser(2);
        this.v = new ArrayList();
        this.j = null;
        this.w = hkkVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = this.v;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lss] */
    @Override // defpackage.ldi
    public final void b() {
        this.c.close();
        e();
        ArrayList arrayListA = a();
        if (arrayListA.isEmpty()) {
            this.t.b.l();
        } else {
            int size = arrayListA.size();
            for (int i = 0; i < size; i++) {
                tht thtVar = (tht) arrayListA.get(i);
                thtVar.b.d();
                thtVar.d.run();
            }
        }
        super.b();
    }

    @Override // defpackage.ldi
    public final void c(lau lauVar) {
        super.c(lauVar);
        tht thtVarI = this.w.i(lauVar);
        if (thtVarI != null) {
            this.v.add(thtVarI);
            return;
        }
        pdo pdoVarB = lauVar.b();
        ((sgt) u.c().M(2385)).u("No valid RAW image found for frame %s, adding empty frame.", pdoVarB != null ? pdoVarB.c : -1L);
        this.v.add(new tht(new RawWriteView(), new FrameMetadata(), new SpatialGainMap(), new iwh(2)));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, lss] */
    public final synchronized void d() {
        thv thvVar = this.j;
        if (thvVar == null) {
            this.t.b.l();
        } else {
            thvVar.b();
            this.j = null;
        }
    }

    public final void e() {
        this.g.arrive();
    }
}
