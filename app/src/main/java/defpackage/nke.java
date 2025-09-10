package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import com.google.ar.core.R;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nke implements tzt {
    private final tzx a;
    private final tzx b;
    private final /* synthetic */ int c;

    public nke(tzx tzxVar, tzx tzxVar2, int i) {
        this.c = i;
        this.a = tzxVar;
        this.b = tzxVar2;
    }

    @Override // defpackage.uem, defpackage.uel
    public final /* synthetic */ Object a() {
        ArrayList arrayList;
        int i;
        switch (this.c) {
            case 0:
                return new njm((muu) this.a.a(), (uem) this.b, 10);
            case 1:
                return new njl(((tzz) this.a).a(), (pbn) this.b.a());
            case 2:
                return new nll(((imo) this.a).a(), ((nld) this.b).a());
            case 3:
                tzx tzxVar = this.a;
                Context contextB = ((imm) this.b).b();
                rwc rwcVarB = ((fkh) tzxVar).b();
                nao naoVar = new nao();
                naoVar.e = contextB.getString(R.string.underwater_color_on_photo_chip_text);
                naoVar.h = contextB;
                naoVar.j = 6;
                naoVar.a = true;
                return naoVar.a();
            case 4:
                rwc rwcVarB2 = ((fkh) this.a).b();
                jvb jvbVar = (jvb) this.b.a();
                if (rwcVarB2.h() && ((owd) rwcVarB2.c()).b()) {
                    Optional optional = jvbVar.f;
                    if (optional.isPresent()) {
                        return qpt.ci((CaptureRequest.Key) optional.get(), true);
                    }
                }
                return qpt.cl();
            case 5:
                tzx tzxVar2 = this.a;
                Context contextB2 = ((imm) this.b).b();
                Executor executor = (Executor) tzxVar2.a();
                Object systemService = contextB2.getSystemService("download");
                systemService.getClass();
                return new mwq(new nnb((DownloadManager) systemService, contextB2, contextB2.getSharedPreferences("PersistSimpleDownloadManager.pref", 0)), executor);
            case 6:
                return new syj(((imm) this.b).b(), (hbj) this.a.a());
            case 7:
                pbn pbnVar = (pbn) this.a.a();
                return new nnm(pbnVar);
            case 8:
                if (((imm) this.b).b().checkSelfPermission("android.permission.MANAGE_WIFI_NETWORK_SELECTION") == -1) {
                    return false;
                }
                gzi gziVar = hay.a;
                return false;
            case 9:
                return new nti((mdy) this.a.a(), ((pba) this.b).a());
            case 10:
                return new ntz((rwc) this.a.a(), this.b, 0);
            case 11:
                hbj hbjVar = (hbj) this.b.a();
                return (hbjVar.p(haz.a) && hbjVar.p(gzo.bz)) ? ((jaf) this.a).b() : rvk.a;
            case 12:
                rwc rwcVarB3 = ((jaf) this.b).b();
                return new ojl();
            case 13:
                ((pnp) this.b.a()).getClass();
                tzx tzxVar3 = this.a;
                tzxVar3.getClass();
                return ((pcj) tzxVar3).a();
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return new mwq((pt) this.a.a(), (pci) this.b.a());
            case 15:
                return new qqq(((pfm) this.b).b(), (scn) this.a.a());
            case 16:
                return new lat((Handler) this.b.a(), (pbn) this.a.a());
            case 17:
                return new pfx(this.b, ((pba) this.a).a());
            case 18:
                return new mwq((pmg) this.a.a(), (qpf) this.b.a());
            case 19:
                pdt pdtVarA = ((pfn) this.b).a();
                Map map = (Map) this.a.a();
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                sbp<pej> sbpVar = pdtVarA.c.b;
                sbpVar.getClass();
                for (pej pejVar : sbpVar) {
                    linkedHashMap.put(pejVar.a, pejVar.b);
                }
                scn<pej> scnVar = pdtVarA.h;
                scnVar.getClass();
                for (pej pejVar2 : scnVar) {
                    linkedHashMap.put(pejVar2.a, pejVar2.b);
                }
                String str = pdtVarA.a.a;
                str.getClass();
                pp.b(str);
                List listBN = ske.bN(map.values());
                ped pedVar = (ped) pdtVarA.n.f();
                byte[] bArr = null;
                if (pedVar == null) {
                    arrayList = null;
                } else {
                    sbp<pas> sbpVar2 = pedVar.b;
                    ArrayList arrayList2 = new ArrayList(ske.bq(sbpVar2, 10));
                    for (pas pasVar : sbpVar2) {
                        Size size = new Size(pasVar.a, pasVar.b);
                        int i2 = pedVar.a;
                        arrayList2.add(new qqv(byi.bP(size, i2, null, null, null, null, null, 2044), i2));
                    }
                    arrayList = arrayList2;
                }
                pei peiVar = pdtVarA.b;
                peiVar.getClass();
                int iOrdinal = peiVar.ordinal();
                if (iOrdinal == 0) {
                    i = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new uet();
                    }
                    i = 1;
                }
                ufw ufwVar = ufw.a;
                ufx ufxVar = ufx.a;
                return new pl(str, listBN, ufwVar, arrayList, linkedHashMap, i, ufxVar, ufwVar, ufxVar, new qn(bArr), new pm(new byi()));
            default:
                return new pmv((vp) this.b.a(), (Map) this.a.a());
        }
    }

    public nke(tzx tzxVar, tzx tzxVar2, int i, float[] fArr) {
        this.c = i;
        this.b = tzxVar;
        this.a = tzxVar2;
    }
}
