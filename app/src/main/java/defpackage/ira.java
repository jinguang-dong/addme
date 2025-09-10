package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.ar.core.R;
import j$.util.Collection;
import j$.util.Optional;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ira {
    public static final sgv a = sgv.g("ira");
    public final Map b;
    public final Context c;
    public final Executor d;
    public final HashMap e;
    public final HashMap f;
    public final uem g;
    public syu h;
    private final Map i;
    private final Map j;
    private final Map k;
    private final Map l;
    private final mbq m;
    private final hbj n;

    public ira(Context context, Executor executor, mbq mbqVar, uem uemVar, hbj hbjVar) {
        sbr sbrVar = new sbr();
        isj isjVar = isj.BACKGROUND;
        iqx iqxVarA = iqy.a();
        iqxVarA.a = Optional.of(Integer.valueOf(R.raw.GS100_Chicken_LayerBG_v12));
        iqxVarA.f(true);
        sbrVar.f(isjVar, iqxVarA.a());
        isj isjVar2 = isj.CHARACTER_MAIN_IDLE_LOOP;
        iqx iqxVarA2 = iqy.a();
        Integer numValueOf = Integer.valueOf(R.raw.GS110_Chicken_LayerHero_IdleLoop_v13);
        iqxVarA2.a = Optional.of(numValueOf);
        iqxVarA2.b = Optional.of(Integer.valueOf(R.raw.Sound_GS110_Chicken_IdleLoop_240810));
        iqxVarA2.e(true);
        iqxVarA2.f(true);
        sbrVar.f(isjVar2, iqxVarA2.a());
        isj isjVar3 = isj.CHARACTER_MAIN_HINT;
        iqx iqxVarA3 = iqy.a();
        iqxVarA3.a = Optional.of(numValueOf);
        iqxVarA3.b = Optional.of(Integer.valueOf(R.raw.Sound_GS120_Chicken_IdleHint_240810));
        sbrVar.f(isjVar3, iqxVarA3.a());
        isj isjVar4 = isj.CHARACTER_SUB_HINT;
        iqx iqxVarA4 = iqy.a();
        iqxVarA4.a = Optional.of(Integer.valueOf(R.raw.GS120_Chicken_LayerFriend_IdleHint_v13));
        sbrVar.f(isjVar4, iqxVarA4.a());
        isj isjVar5 = isj.CHARACTER_MAIN_SURPRISE_ENTER;
        iqx iqxVarA5 = iqy.a();
        iqxVarA5.a = Optional.of(Integer.valueOf(R.raw.GS140_Chicken_LayerHero_IdleSurprise_v13));
        iqxVarA5.b = Optional.of(Integer.valueOf(R.raw.Sound_GS140_Chicken_IdleSurprise_240810));
        sbrVar.f(isjVar5, iqxVarA5.a());
        isj isjVar6 = isj.CHARACTER_MAIN_SURPRISE_LOOP;
        iqx iqxVarA6 = iqy.a();
        iqxVarA6.a = Optional.of(Integer.valueOf(R.raw.GS150_Chicken_LayerHero_SurpriseLoop_v13));
        iqxVarA6.b = Optional.of(Integer.valueOf(R.raw.Sound_GS150_Chicken_SurpriseLoop_240810));
        sbrVar.f(isjVar6, iqxVarA6.a());
        isj isjVar7 = isj.CHARACTER_MAIN_SURPRISE_EXIT;
        iqx iqxVarA7 = iqy.a();
        iqxVarA7.a = Optional.of(Integer.valueOf(R.raw.GS160_Chicken_LayerHero_SurpriseIdle_v13));
        iqxVarA7.b = Optional.of(Integer.valueOf(R.raw.Sound_GS160_Chicken_SurpriseIdle_240810));
        sbrVar.f(isjVar7, iqxVarA7.a());
        this.i = new HashMap(sbrVar.b());
        sbr sbrVar2 = new sbr();
        iqx iqxVarA8 = iqy.a();
        iqxVarA8.a = Optional.of(Integer.valueOf(R.raw.GS200_Fish_LayerBG_v17));
        iqxVarA8.f(true);
        sbrVar2.f(isjVar, iqxVarA8.a());
        iqx iqxVarA9 = iqy.a();
        iqxVarA9.a = Optional.of(Integer.valueOf(R.raw.GS210_Fish_LayerHero_IdleLoop_v16));
        iqxVarA9.b = Optional.of(Integer.valueOf(R.raw.Sound_GS210_Fish_IdleLoop_240810));
        iqxVarA9.e(true);
        iqxVarA9.f(true);
        sbrVar2.f(isjVar2, iqxVarA9.a());
        isj isjVar8 = isj.CHARACTER_SUB_IDLE_LOOP;
        iqx iqxVarA10 = iqy.a();
        iqxVarA10.a = Optional.of(Integer.valueOf(R.raw.GS210_Fish_LayerBubbles_IdleLoop));
        iqxVarA10.e(true);
        iqxVarA10.f(true);
        sbrVar2.f(isjVar8, iqxVarA10.a());
        iqx iqxVarA11 = iqy.a();
        iqxVarA11.a = Optional.of(Integer.valueOf(R.raw.GS220_Fish_LayerHero_IdleHint_v16));
        iqxVarA11.b = Optional.of(Integer.valueOf(R.raw.Sound_GS220_Fish_IdleHint_240810));
        sbrVar2.f(isjVar3, iqxVarA11.a());
        iqx iqxVarA12 = iqy.a();
        iqxVarA12.a = Optional.of(Integer.valueOf(R.raw.GS220_Fish_LayerBubbles_IdleHint));
        sbrVar2.f(isjVar4, iqxVarA12.a());
        iqx iqxVarA13 = iqy.a();
        iqxVarA13.a = Optional.of(Integer.valueOf(R.raw.GS240_Fish_LayerHero_IdleSurprise_v16));
        iqxVarA13.b = Optional.of(Integer.valueOf(R.raw.Sound_GS240_Fish_IdleSurprise_240810));
        sbrVar2.f(isjVar5, iqxVarA13.a());
        iqx iqxVarA14 = iqy.a();
        iqxVarA14.a = Optional.of(Integer.valueOf(R.raw.GS250_Fish_LayerHero_SurpriseLoop_v16));
        iqxVarA14.b = Optional.of(Integer.valueOf(R.raw.Sound_GS250_Fish_SurpriseLoop_240810));
        sbrVar2.f(isjVar6, iqxVarA14.a());
        iqx iqxVarA15 = iqy.a();
        iqxVarA15.a = Optional.of(Integer.valueOf(R.raw.GS260_Fish_LayerHero_SurpriseIdle_v16));
        iqxVarA15.b = Optional.of(Integer.valueOf(R.raw.Sound_GS260_Fish_SurpriseIdle_240810));
        sbrVar2.f(isjVar7, iqxVarA15.a());
        this.j = new HashMap(sbrVar2.b());
        sbr sbrVar3 = new sbr();
        iqx iqxVarA16 = iqy.a();
        iqxVarA16.a = Optional.of(Integer.valueOf(R.raw.GS310_Blocks_IdleLoop_v16));
        iqxVarA16.b = Optional.of(Integer.valueOf(R.raw.Sound_GS310_Blocks_IdleLoop_240810));
        iqxVarA16.e(true);
        iqxVarA16.f(true);
        sbrVar3.f(isjVar2, iqxVarA16.a());
        isj isjVar9 = isj.d;
        iqx iqxVarA17 = iqy.a();
        iqxVarA17.a = Optional.of(Integer.valueOf(R.raw.GS320_Blocks_IdleHint_v16));
        iqxVarA17.b = Optional.of(Integer.valueOf(R.raw.Sound_GS320_Blocks_IdleHint_240810));
        sbrVar3.f(isjVar9, iqxVarA17.a());
        iqx iqxVarA18 = iqy.a();
        iqxVarA18.a = Optional.of(Integer.valueOf(R.raw.GS330_Blocks_HintLoop_v16));
        iqxVarA18.b = Optional.of(Integer.valueOf(R.raw.Sound_GS330_Blocks_HintLoop_240810));
        sbrVar3.f(isjVar3, iqxVarA18.a());
        isj isjVar10 = isj.CHARACTER_MAIN_HINT_EXIT;
        iqx iqxVarA19 = iqy.a();
        iqxVarA19.a = Optional.of(Integer.valueOf(R.raw.GS340_Blocks_HintIdle_v16));
        iqxVarA19.b = Optional.of(Integer.valueOf(R.raw.Sound_GS340_Blocks_HintIdle_240810));
        sbrVar3.f(isjVar10, iqxVarA19.a());
        iqx iqxVarA20 = iqy.a();
        iqxVarA20.a = Optional.of(Integer.valueOf(R.raw.GS350_Blocks_HintSurprise_v16));
        iqxVarA20.b = Optional.of(Integer.valueOf(R.raw.Sound_GS350_Blocks_HintSurprise_240810));
        sbrVar3.f(isjVar5, iqxVarA20.a());
        iqx iqxVarA21 = iqy.a();
        iqxVarA21.a = Optional.of(Integer.valueOf(R.raw.GS360_Blocks_SurpriseLoop_v16));
        iqxVarA21.b = Optional.of(Integer.valueOf(R.raw.Sound_GS360_Blocks_SurpriseLoop_240810));
        sbrVar3.f(isjVar6, iqxVarA21.a());
        iqx iqxVarA22 = iqy.a();
        iqxVarA22.a = Optional.of(Integer.valueOf(R.raw.GS370_Blocks_SurpriseIdle_v16));
        iqxVarA22.b = Optional.of(Integer.valueOf(R.raw.Sound_GS370_Blocks_SurpriseIdle_240810));
        sbrVar3.f(isjVar7, iqxVarA22.a());
        this.k = new HashMap(sbrVar3.b());
        sbr sbrVar4 = new sbr();
        iqx iqxVarA23 = iqy.a();
        iqxVarA23.a = Optional.of(Integer.valueOf(R.raw.GS410_Geo_IdleLoop_v19));
        iqxVarA23.b = Optional.of(Integer.valueOf(R.raw.Sound_GS410_Geo_IdleLoop_240810));
        iqxVarA23.b(sbp.n(40, 80, 120));
        iqxVarA23.f(true);
        sbrVar4.f(isjVar2, iqxVarA23.a());
        iqx iqxVarA24 = iqy.a();
        iqxVarA24.a = Optional.of(Integer.valueOf(R.raw.GS420_Geo_SurpriseLoop_v19));
        iqxVarA24.b = Optional.of(Integer.valueOf(R.raw.Sound_GS420_Geo_SurpriseLoop_32kHz_240810));
        iqxVarA24.b(sbp.m(80, 160));
        sbrVar4.f(isjVar6, iqxVarA24.a());
        this.l = new HashMap(sbrVar4.b());
        this.b = new EnumMap(isj.class);
        this.e = new HashMap();
        this.f = new HashMap();
        this.c = context;
        this.d = executor;
        this.m = mbqVar;
        this.g = uemVar;
        this.n = hbjVar;
    }

    public static Rect a(Rect rect, Rect rect2) {
        float fWidth;
        int iWidth;
        if (rect.width() / rect.height() >= rect2.width() / rect2.height()) {
            fWidth = rect2.height();
            iWidth = rect.height();
        } else {
            fWidth = rect2.width();
            iWidth = rect.width();
        }
        float f = fWidth / iWidth;
        float fWidth2 = rect.width();
        float fHeight = rect.height();
        int i = (int) (fWidth2 * f);
        int iWidth2 = rect.left + ((rect2.width() - i) / 2);
        int i2 = (int) (fHeight * f);
        int iHeight = rect.top + ((rect2.height() - i2) / 2);
        return new Rect(iWidth2, iHeight, i + iWidth2, i2 + iHeight);
    }

    public static int e(iqz iqzVar) {
        int iOrdinal = iqzVar.ordinal();
        if (iOrdinal == 0) {
            return 2;
        }
        if (iOrdinal == 1) {
            return 3;
        }
        if (iOrdinal == 2) {
            return 4;
        }
        if (iOrdinal == 3) {
            return 5;
        }
        if (iOrdinal == 4) {
            return 6;
        }
        throw new RuntimeException(null, null);
    }

    public final syu b(iqz iqzVar) {
        int iOrdinal = iqzVar.ordinal();
        if (iOrdinal == 0) {
            return ske.M(this.i);
        }
        if (iOrdinal == 1) {
            return ske.M(this.j);
        }
        if (iOrdinal == 2) {
            return ske.M(this.k);
        }
        if (iOrdinal == 3) {
            return ske.M(this.l);
        }
        if (iOrdinal != 4) {
            throw new RuntimeException(null, null);
        }
        Map map = this.b;
        if (!map.isEmpty()) {
            return ske.M(map);
        }
        isg isgVar = (isg) this.g.a();
        isgVar.getClass();
        return swz.i(isgVar.b(), new fym(this, 7), ojl.ce());
    }

    public final void c(iqz iqzVar, isj isjVar, iqy iqyVar) {
        syu syuVarC;
        gzg gzgVar = gza.a;
        Optional optional = iqyVar.c;
        if (optional.isPresent()) {
            syuVarC = this.m.b(((Integer) optional.get()).intValue());
        } else {
            Optional optional2 = iqyVar.d;
            syuVarC = optional2.isPresent() ? this.m.c((String) optional2.get()) : ske.M(true);
        }
        ske.W(syuVarC, new iqw(this, iqyVar, isjVar, iqzVar, 0), sxo.a);
    }

    public final boolean d() {
        return Collection.EL.stream(this.e.values()).allMatch(new hzk(6)) && Collection.EL.stream(this.f.values()).allMatch(new hzk(4));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [sgt, shi] */
    public final void f(isj isjVar, iqy iqyVar) {
        Object obj;
        if (iqyVar.a.isPresent()) {
            obj = efm.c(this.c, ((Integer) iqyVar.a.get()).intValue()).a;
        } else {
            Optional optional = iqyVar.b;
            if (optional.isPresent()) {
                try {
                    obj = efm.b(new FileInputStream((String) optional.get()), null).a;
                } catch (FileNotFoundException e) {
                    ((sgt) ((sgt) a.b().i(e)).M((char) 2236)).s("FileNotFoundException while loading lottie animation.");
                }
            } else {
                obj = null;
            }
        }
        szh szhVar = iqyVar.f;
        obj.getClass();
        szhVar.e(obj);
        this.e.put(isjVar, true);
    }
}
