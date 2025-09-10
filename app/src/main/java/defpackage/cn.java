package defpackage;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cn {
    public final bm a;
    public final byz c;
    private final co d;
    private boolean e = false;
    public int b = -1;

    public cn(byz byzVar, co coVar, bm bmVar) {
        this.c = byzVar;
        this.d = coVar;
        this.a = bmVar;
    }

    final void a() {
        View view;
        View view2;
        bm bmVar = this.a;
        bm bmVarF = ch.f(bmVar.O);
        bm bmVar2 = bmVar.D;
        if (bmVarF != null && !bmVarF.equals(bmVar2)) {
            int i = bmVar.F;
            int i2 = cui.a;
            bmVar.getClass();
            cuu cuuVar = new cuu(bmVar, bmVarF, i);
            cui.d(cuuVar);
            cuh cuhVarB = cui.b(bmVar);
            if (cuhVarB.b.contains(cug.e) && cui.e(cuhVarB, bmVar.getClass(), cuuVar.getClass())) {
                cui.c(cuhVarB, cuuVar);
            }
        }
        co coVar = this.d;
        ViewGroup viewGroup = bmVar.O;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            ArrayList arrayList = coVar.a;
            int iIndexOf = arrayList.indexOf(bmVar);
            int i3 = iIndexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        bm bmVar3 = (bm) arrayList.get(iIndexOf);
                        if (bmVar3.O == viewGroup && (view = bmVar3.P) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    bm bmVar4 = (bm) arrayList.get(i3);
                    if (bmVar4.O == viewGroup && (view2 = bmVar4.P) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        bmVar.O.addView(bmVar.P, iIndexOfChild);
    }

    final void b() throws Resources.NotFoundException {
        String resourceName;
        bm bmVar = this.a;
        if (bmVar.u) {
            return;
        }
        if (ch.X(3)) {
            Objects.toString(bmVar);
        }
        Bundle bundle = bmVar.g;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterL = bmVar.l(bundle2);
        ViewGroup viewGroup2 = bmVar.O;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = bmVar.F;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException(a.bz(bmVar, "Cannot create fragment ", " for a container view with no id"));
                }
                viewGroup = (ViewGroup) bmVar.A.n.a(i);
                if (viewGroup == null) {
                    if (!bmVar.x && !bmVar.w) {
                        try {
                            resourceName = bmVar.getResources().getResourceName(bmVar.F);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        StringBuilder sb = new StringBuilder("No view found for id 0x");
                        bm bmVar2 = this.a;
                        sb.append(Integer.toHexString(bmVar2.F));
                        sb.append(" (");
                        sb.append(resourceName);
                        sb.append(") for fragment ");
                        sb.append(bmVar2);
                        throw new IllegalArgumentException(sb.toString());
                    }
                } else if (!(viewGroup instanceof bs)) {
                    bm bmVar3 = this.a;
                    int i2 = cui.a;
                    bmVar3.getClass();
                    cut cutVar = new cut(bmVar3, viewGroup);
                    cui.d(cutVar);
                    cuh cuhVarB = cui.b(bmVar3);
                    if (cuhVarB.b.contains(cug.i) && cui.e(cuhVarB, bmVar3.getClass(), cutVar.getClass())) {
                        cui.c(cuhVarB, cutVar);
                    }
                }
            }
        }
        bm bmVar4 = this.a;
        bmVar4.O = viewGroup;
        bmVar4.fh(layoutInflaterL, viewGroup, bundle2);
        if (bmVar4.P != null) {
            if (ch.X(3)) {
                Objects.toString(bmVar4);
            }
            bmVar4.P.setSaveFromParentEnabled(false);
            bmVar4.P.setTag(R.id.fragment_container_view_tag, bmVar4);
            if (viewGroup != null) {
                a();
            }
            if (bmVar4.H) {
                bmVar4.P.setVisibility(8);
            }
            if (bmVar4.P.isAttachedToWindow()) {
                View view = bmVar4.P;
                int[] iArr = con.a;
                coe.b(view);
            } else {
                View view2 = bmVar4.P;
                view2.addOnAttachStateChangeListener(new ft(view2, 1));
            }
            bmVar4.q();
            this.c.T(bmVar4, bmVar4.P, bundle2, false);
            int visibility = bmVar4.P.getVisibility();
            bmVar4.k().q = bmVar4.P.getAlpha();
            if (bmVar4.O != null && visibility == 0) {
                View viewFindFocus = bmVar4.P.findFocus();
                if (viewFindFocus != null) {
                    bmVar4.t(viewFindFocus);
                    if (ch.X(2)) {
                        Objects.toString(viewFindFocus);
                        Objects.toString(bmVar4);
                    }
                }
                bmVar4.P.setAlpha(0.0f);
            }
        }
        bmVar4.f = 2;
    }

    final void c() {
        bm bmVar = this.a;
        if (bmVar.u && bmVar.v && !bmVar.y) {
            if (ch.X(3)) {
                Objects.toString(bmVar);
            }
            Bundle bundle = bmVar.g;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            bmVar.fh(bmVar.l(bundle2), null, bundle2);
            View view = bmVar.P;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                bmVar.P.setTag(R.id.fragment_container_view_tag, bmVar);
                if (bmVar.H) {
                    bmVar.P.setVisibility(8);
                }
                bmVar.q();
                this.c.T(bmVar, bmVar.P, bundle2, false);
                bmVar.f = 2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:408:0x03c8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x03c8, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:299:0x054c A[Catch: all -> 0x06ac, TryCatch #0 {all -> 0x06ac, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0021, B:80:0x00f3, B:87:0x0105, B:89:0x010b, B:90:0x010e, B:95:0x0118, B:103:0x012c, B:105:0x0135, B:98:0x011d, B:100:0x0123, B:102:0x0127, B:106:0x0144, B:108:0x015d, B:110:0x0168, B:111:0x016f, B:112:0x0188, B:113:0x0193, B:93:0x0114, B:114:0x0194, B:115:0x0198, B:117:0x019e, B:118:0x01a1, B:120:0x01b6, B:122:0x01c1, B:123:0x01c8, B:124:0x01d4, B:125:0x01df, B:126:0x01e0, B:128:0x01e4, B:130:0x01e8, B:132:0x0200, B:133:0x0203, B:134:0x0206, B:135:0x020a, B:137:0x0210, B:138:0x0213, B:140:0x0217, B:142:0x021d, B:144:0x022e, B:145:0x0231, B:147:0x0235, B:149:0x0239, B:151:0x023f, B:153:0x0243, B:154:0x024a, B:156:0x0253, B:158:0x0257, B:159:0x025f, B:160:0x026a, B:161:0x026b, B:162:0x0279, B:163:0x0281, B:165:0x0287, B:166:0x028a, B:168:0x028e, B:169:0x0292, B:171:0x0296, B:173:0x02b7, B:174:0x02c3, B:175:0x02ce, B:176:0x02cf, B:177:0x02d6, B:179:0x02dc, B:180:0x02df, B:183:0x02e7, B:185:0x02f1, B:196:0x034a, B:197:0x034d, B:199:0x0365, B:200:0x0371, B:202:0x038e, B:203:0x0396, B:205:0x039c, B:206:0x03a6, B:207:0x03b7, B:208:0x03c2, B:186:0x02fb, B:187:0x031a, B:188:0x031b, B:190:0x031f, B:193:0x0328, B:194:0x0347, B:209:0x03c3, B:210:0x03c5, B:212:0x03cb, B:214:0x03d1, B:215:0x03d4, B:217:0x03dd, B:218:0x03e4, B:220:0x03f6, B:221:0x03fc, B:222:0x0407, B:223:0x0408, B:224:0x040b, B:226:0x0411, B:227:0x0414, B:229:0x041d, B:230:0x0424, B:232:0x0436, B:233:0x043c, B:234:0x0447, B:235:0x0448, B:237:0x044e, B:238:0x0451, B:240:0x0457, B:242:0x045b, B:243:0x045e, B:245:0x0462, B:247:0x0466, B:249:0x0474, B:250:0x0477, B:251:0x047a, B:252:0x047e, B:253:0x0484, B:255:0x048a, B:256:0x048d, B:258:0x0491, B:260:0x0495, B:261:0x0498, B:263:0x04a1, B:265:0x04b1, B:266:0x04b8, B:268:0x04c3, B:270:0x04d2, B:271:0x04de, B:272:0x04f6, B:273:0x0501, B:274:0x0502, B:276:0x050a, B:277:0x050d, B:279:0x0511, B:284:0x051c, B:286:0x0527, B:289:0x0532, B:291:0x0536, B:293:0x053c, B:295:0x0540, B:296:0x0542, B:297:0x0546, B:299:0x054c, B:302:0x055e, B:304:0x0563, B:305:0x056a, B:307:0x0583, B:308:0x0592, B:310:0x0598, B:312:0x05a0, B:314:0x05ac, B:315:0x05b1, B:317:0x05b5, B:318:0x05bb, B:319:0x05c0, B:320:0x05cb, B:300:0x0553, B:321:0x05cc, B:323:0x05d2, B:324:0x05d5, B:326:0x05e2, B:328:0x05e8, B:329:0x05f2, B:331:0x0603, B:337:0x0616, B:339:0x061c, B:340:0x061f, B:334:0x060a, B:341:0x0624, B:342:0x062f, B:345:0x0634, B:347:0x0638, B:349:0x063e, B:351:0x0646, B:352:0x0649, B:354:0x0659, B:355:0x065c, B:356:0x065f, B:358:0x0663, B:360:0x0667, B:362:0x066b, B:364:0x0677, B:366:0x067d, B:367:0x0680, B:368:0x0684, B:370:0x068a, B:371:0x068d, B:372:0x0690, B:374:0x0694, B:376:0x0698, B:378:0x069e, B:379:0x06a0, B:13:0x0025, B:18:0x0035, B:22:0x0048, B:24:0x004c, B:26:0x0050, B:28:0x005a, B:30:0x0060, B:31:0x0065, B:33:0x0069, B:34:0x0070, B:35:0x0074, B:37:0x0078, B:39:0x007c, B:40:0x0080, B:42:0x0084, B:43:0x0088, B:45:0x008c, B:47:0x009d, B:49:0x00a1, B:51:0x00a7, B:54:0x00ad, B:60:0x00b7, B:69:0x00d6, B:71:0x00da, B:73:0x00de, B:74:0x00e2, B:76:0x00e6, B:77:0x00ea, B:79:0x00f0, B:62:0x00be, B:63:0x00c3, B:65:0x00c7, B:67:0x00cd, B:68:0x00d2, B:19:0x003a, B:20:0x003f, B:21:0x0044), top: B:385:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0553 A[Catch: all -> 0x06ac, TryCatch #0 {all -> 0x06ac, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0021, B:80:0x00f3, B:87:0x0105, B:89:0x010b, B:90:0x010e, B:95:0x0118, B:103:0x012c, B:105:0x0135, B:98:0x011d, B:100:0x0123, B:102:0x0127, B:106:0x0144, B:108:0x015d, B:110:0x0168, B:111:0x016f, B:112:0x0188, B:113:0x0193, B:93:0x0114, B:114:0x0194, B:115:0x0198, B:117:0x019e, B:118:0x01a1, B:120:0x01b6, B:122:0x01c1, B:123:0x01c8, B:124:0x01d4, B:125:0x01df, B:126:0x01e0, B:128:0x01e4, B:130:0x01e8, B:132:0x0200, B:133:0x0203, B:134:0x0206, B:135:0x020a, B:137:0x0210, B:138:0x0213, B:140:0x0217, B:142:0x021d, B:144:0x022e, B:145:0x0231, B:147:0x0235, B:149:0x0239, B:151:0x023f, B:153:0x0243, B:154:0x024a, B:156:0x0253, B:158:0x0257, B:159:0x025f, B:160:0x026a, B:161:0x026b, B:162:0x0279, B:163:0x0281, B:165:0x0287, B:166:0x028a, B:168:0x028e, B:169:0x0292, B:171:0x0296, B:173:0x02b7, B:174:0x02c3, B:175:0x02ce, B:176:0x02cf, B:177:0x02d6, B:179:0x02dc, B:180:0x02df, B:183:0x02e7, B:185:0x02f1, B:196:0x034a, B:197:0x034d, B:199:0x0365, B:200:0x0371, B:202:0x038e, B:203:0x0396, B:205:0x039c, B:206:0x03a6, B:207:0x03b7, B:208:0x03c2, B:186:0x02fb, B:187:0x031a, B:188:0x031b, B:190:0x031f, B:193:0x0328, B:194:0x0347, B:209:0x03c3, B:210:0x03c5, B:212:0x03cb, B:214:0x03d1, B:215:0x03d4, B:217:0x03dd, B:218:0x03e4, B:220:0x03f6, B:221:0x03fc, B:222:0x0407, B:223:0x0408, B:224:0x040b, B:226:0x0411, B:227:0x0414, B:229:0x041d, B:230:0x0424, B:232:0x0436, B:233:0x043c, B:234:0x0447, B:235:0x0448, B:237:0x044e, B:238:0x0451, B:240:0x0457, B:242:0x045b, B:243:0x045e, B:245:0x0462, B:247:0x0466, B:249:0x0474, B:250:0x0477, B:251:0x047a, B:252:0x047e, B:253:0x0484, B:255:0x048a, B:256:0x048d, B:258:0x0491, B:260:0x0495, B:261:0x0498, B:263:0x04a1, B:265:0x04b1, B:266:0x04b8, B:268:0x04c3, B:270:0x04d2, B:271:0x04de, B:272:0x04f6, B:273:0x0501, B:274:0x0502, B:276:0x050a, B:277:0x050d, B:279:0x0511, B:284:0x051c, B:286:0x0527, B:289:0x0532, B:291:0x0536, B:293:0x053c, B:295:0x0540, B:296:0x0542, B:297:0x0546, B:299:0x054c, B:302:0x055e, B:304:0x0563, B:305:0x056a, B:307:0x0583, B:308:0x0592, B:310:0x0598, B:312:0x05a0, B:314:0x05ac, B:315:0x05b1, B:317:0x05b5, B:318:0x05bb, B:319:0x05c0, B:320:0x05cb, B:300:0x0553, B:321:0x05cc, B:323:0x05d2, B:324:0x05d5, B:326:0x05e2, B:328:0x05e8, B:329:0x05f2, B:331:0x0603, B:337:0x0616, B:339:0x061c, B:340:0x061f, B:334:0x060a, B:341:0x0624, B:342:0x062f, B:345:0x0634, B:347:0x0638, B:349:0x063e, B:351:0x0646, B:352:0x0649, B:354:0x0659, B:355:0x065c, B:356:0x065f, B:358:0x0663, B:360:0x0667, B:362:0x066b, B:364:0x0677, B:366:0x067d, B:367:0x0680, B:368:0x0684, B:370:0x068a, B:371:0x068d, B:372:0x0690, B:374:0x0694, B:376:0x0698, B:378:0x069e, B:379:0x06a0, B:13:0x0025, B:18:0x0035, B:22:0x0048, B:24:0x004c, B:26:0x0050, B:28:0x005a, B:30:0x0060, B:31:0x0065, B:33:0x0069, B:34:0x0070, B:35:0x0074, B:37:0x0078, B:39:0x007c, B:40:0x0080, B:42:0x0084, B:43:0x0088, B:45:0x008c, B:47:0x009d, B:49:0x00a1, B:51:0x00a7, B:54:0x00ad, B:60:0x00b7, B:69:0x00d6, B:71:0x00da, B:73:0x00de, B:74:0x00e2, B:76:0x00e6, B:77:0x00ea, B:79:0x00f0, B:62:0x00be, B:63:0x00c3, B:65:0x00c7, B:67:0x00cd, B:68:0x00d2, B:19:0x003a, B:20:0x003f, B:21:0x0044), top: B:385:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x055e A[Catch: all -> 0x06ac, TryCatch #0 {all -> 0x06ac, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0021, B:80:0x00f3, B:87:0x0105, B:89:0x010b, B:90:0x010e, B:95:0x0118, B:103:0x012c, B:105:0x0135, B:98:0x011d, B:100:0x0123, B:102:0x0127, B:106:0x0144, B:108:0x015d, B:110:0x0168, B:111:0x016f, B:112:0x0188, B:113:0x0193, B:93:0x0114, B:114:0x0194, B:115:0x0198, B:117:0x019e, B:118:0x01a1, B:120:0x01b6, B:122:0x01c1, B:123:0x01c8, B:124:0x01d4, B:125:0x01df, B:126:0x01e0, B:128:0x01e4, B:130:0x01e8, B:132:0x0200, B:133:0x0203, B:134:0x0206, B:135:0x020a, B:137:0x0210, B:138:0x0213, B:140:0x0217, B:142:0x021d, B:144:0x022e, B:145:0x0231, B:147:0x0235, B:149:0x0239, B:151:0x023f, B:153:0x0243, B:154:0x024a, B:156:0x0253, B:158:0x0257, B:159:0x025f, B:160:0x026a, B:161:0x026b, B:162:0x0279, B:163:0x0281, B:165:0x0287, B:166:0x028a, B:168:0x028e, B:169:0x0292, B:171:0x0296, B:173:0x02b7, B:174:0x02c3, B:175:0x02ce, B:176:0x02cf, B:177:0x02d6, B:179:0x02dc, B:180:0x02df, B:183:0x02e7, B:185:0x02f1, B:196:0x034a, B:197:0x034d, B:199:0x0365, B:200:0x0371, B:202:0x038e, B:203:0x0396, B:205:0x039c, B:206:0x03a6, B:207:0x03b7, B:208:0x03c2, B:186:0x02fb, B:187:0x031a, B:188:0x031b, B:190:0x031f, B:193:0x0328, B:194:0x0347, B:209:0x03c3, B:210:0x03c5, B:212:0x03cb, B:214:0x03d1, B:215:0x03d4, B:217:0x03dd, B:218:0x03e4, B:220:0x03f6, B:221:0x03fc, B:222:0x0407, B:223:0x0408, B:224:0x040b, B:226:0x0411, B:227:0x0414, B:229:0x041d, B:230:0x0424, B:232:0x0436, B:233:0x043c, B:234:0x0447, B:235:0x0448, B:237:0x044e, B:238:0x0451, B:240:0x0457, B:242:0x045b, B:243:0x045e, B:245:0x0462, B:247:0x0466, B:249:0x0474, B:250:0x0477, B:251:0x047a, B:252:0x047e, B:253:0x0484, B:255:0x048a, B:256:0x048d, B:258:0x0491, B:260:0x0495, B:261:0x0498, B:263:0x04a1, B:265:0x04b1, B:266:0x04b8, B:268:0x04c3, B:270:0x04d2, B:271:0x04de, B:272:0x04f6, B:273:0x0501, B:274:0x0502, B:276:0x050a, B:277:0x050d, B:279:0x0511, B:284:0x051c, B:286:0x0527, B:289:0x0532, B:291:0x0536, B:293:0x053c, B:295:0x0540, B:296:0x0542, B:297:0x0546, B:299:0x054c, B:302:0x055e, B:304:0x0563, B:305:0x056a, B:307:0x0583, B:308:0x0592, B:310:0x0598, B:312:0x05a0, B:314:0x05ac, B:315:0x05b1, B:317:0x05b5, B:318:0x05bb, B:319:0x05c0, B:320:0x05cb, B:300:0x0553, B:321:0x05cc, B:323:0x05d2, B:324:0x05d5, B:326:0x05e2, B:328:0x05e8, B:329:0x05f2, B:331:0x0603, B:337:0x0616, B:339:0x061c, B:340:0x061f, B:334:0x060a, B:341:0x0624, B:342:0x062f, B:345:0x0634, B:347:0x0638, B:349:0x063e, B:351:0x0646, B:352:0x0649, B:354:0x0659, B:355:0x065c, B:356:0x065f, B:358:0x0663, B:360:0x0667, B:362:0x066b, B:364:0x0677, B:366:0x067d, B:367:0x0680, B:368:0x0684, B:370:0x068a, B:371:0x068d, B:372:0x0690, B:374:0x0694, B:376:0x0698, B:378:0x069e, B:379:0x06a0, B:13:0x0025, B:18:0x0035, B:22:0x0048, B:24:0x004c, B:26:0x0050, B:28:0x005a, B:30:0x0060, B:31:0x0065, B:33:0x0069, B:34:0x0070, B:35:0x0074, B:37:0x0078, B:39:0x007c, B:40:0x0080, B:42:0x0084, B:43:0x0088, B:45:0x008c, B:47:0x009d, B:49:0x00a1, B:51:0x00a7, B:54:0x00ad, B:60:0x00b7, B:69:0x00d6, B:71:0x00da, B:73:0x00de, B:74:0x00e2, B:76:0x00e6, B:77:0x00ea, B:79:0x00f0, B:62:0x00be, B:63:0x00c3, B:65:0x00c7, B:67:0x00cd, B:68:0x00d2, B:19:0x003a, B:20:0x003f, B:21:0x0044), top: B:385:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0583 A[Catch: all -> 0x06ac, TryCatch #0 {all -> 0x06ac, blocks: (B:9:0x0013, B:10:0x0016, B:12:0x0021, B:80:0x00f3, B:87:0x0105, B:89:0x010b, B:90:0x010e, B:95:0x0118, B:103:0x012c, B:105:0x0135, B:98:0x011d, B:100:0x0123, B:102:0x0127, B:106:0x0144, B:108:0x015d, B:110:0x0168, B:111:0x016f, B:112:0x0188, B:113:0x0193, B:93:0x0114, B:114:0x0194, B:115:0x0198, B:117:0x019e, B:118:0x01a1, B:120:0x01b6, B:122:0x01c1, B:123:0x01c8, B:124:0x01d4, B:125:0x01df, B:126:0x01e0, B:128:0x01e4, B:130:0x01e8, B:132:0x0200, B:133:0x0203, B:134:0x0206, B:135:0x020a, B:137:0x0210, B:138:0x0213, B:140:0x0217, B:142:0x021d, B:144:0x022e, B:145:0x0231, B:147:0x0235, B:149:0x0239, B:151:0x023f, B:153:0x0243, B:154:0x024a, B:156:0x0253, B:158:0x0257, B:159:0x025f, B:160:0x026a, B:161:0x026b, B:162:0x0279, B:163:0x0281, B:165:0x0287, B:166:0x028a, B:168:0x028e, B:169:0x0292, B:171:0x0296, B:173:0x02b7, B:174:0x02c3, B:175:0x02ce, B:176:0x02cf, B:177:0x02d6, B:179:0x02dc, B:180:0x02df, B:183:0x02e7, B:185:0x02f1, B:196:0x034a, B:197:0x034d, B:199:0x0365, B:200:0x0371, B:202:0x038e, B:203:0x0396, B:205:0x039c, B:206:0x03a6, B:207:0x03b7, B:208:0x03c2, B:186:0x02fb, B:187:0x031a, B:188:0x031b, B:190:0x031f, B:193:0x0328, B:194:0x0347, B:209:0x03c3, B:210:0x03c5, B:212:0x03cb, B:214:0x03d1, B:215:0x03d4, B:217:0x03dd, B:218:0x03e4, B:220:0x03f6, B:221:0x03fc, B:222:0x0407, B:223:0x0408, B:224:0x040b, B:226:0x0411, B:227:0x0414, B:229:0x041d, B:230:0x0424, B:232:0x0436, B:233:0x043c, B:234:0x0447, B:235:0x0448, B:237:0x044e, B:238:0x0451, B:240:0x0457, B:242:0x045b, B:243:0x045e, B:245:0x0462, B:247:0x0466, B:249:0x0474, B:250:0x0477, B:251:0x047a, B:252:0x047e, B:253:0x0484, B:255:0x048a, B:256:0x048d, B:258:0x0491, B:260:0x0495, B:261:0x0498, B:263:0x04a1, B:265:0x04b1, B:266:0x04b8, B:268:0x04c3, B:270:0x04d2, B:271:0x04de, B:272:0x04f6, B:273:0x0501, B:274:0x0502, B:276:0x050a, B:277:0x050d, B:279:0x0511, B:284:0x051c, B:286:0x0527, B:289:0x0532, B:291:0x0536, B:293:0x053c, B:295:0x0540, B:296:0x0542, B:297:0x0546, B:299:0x054c, B:302:0x055e, B:304:0x0563, B:305:0x056a, B:307:0x0583, B:308:0x0592, B:310:0x0598, B:312:0x05a0, B:314:0x05ac, B:315:0x05b1, B:317:0x05b5, B:318:0x05bb, B:319:0x05c0, B:320:0x05cb, B:300:0x0553, B:321:0x05cc, B:323:0x05d2, B:324:0x05d5, B:326:0x05e2, B:328:0x05e8, B:329:0x05f2, B:331:0x0603, B:337:0x0616, B:339:0x061c, B:340:0x061f, B:334:0x060a, B:341:0x0624, B:342:0x062f, B:345:0x0634, B:347:0x0638, B:349:0x063e, B:351:0x0646, B:352:0x0649, B:354:0x0659, B:355:0x065c, B:356:0x065f, B:358:0x0663, B:360:0x0667, B:362:0x066b, B:364:0x0677, B:366:0x067d, B:367:0x0680, B:368:0x0684, B:370:0x068a, B:371:0x068d, B:372:0x0690, B:374:0x0694, B:376:0x0698, B:378:0x069e, B:379:0x06a0, B:13:0x0025, B:18:0x0035, B:22:0x0048, B:24:0x004c, B:26:0x0050, B:28:0x005a, B:30:0x0060, B:31:0x0065, B:33:0x0069, B:34:0x0070, B:35:0x0074, B:37:0x0078, B:39:0x007c, B:40:0x0080, B:42:0x0084, B:43:0x0088, B:45:0x008c, B:47:0x009d, B:49:0x00a1, B:51:0x00a7, B:54:0x00ad, B:60:0x00b7, B:69:0x00d6, B:71:0x00da, B:73:0x00de, B:74:0x00e2, B:76:0x00e6, B:77:0x00ea, B:79:0x00f0, B:62:0x00be, B:63:0x00c3, B:65:0x00c7, B:67:0x00cd, B:68:0x00d2, B:19:0x003a, B:20:0x003f, B:21:0x0044), top: B:385:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x05c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn.d():void");
    }

    final void e(ClassLoader classLoader) {
        bm bmVar = this.a;
        Bundle bundle = bmVar.g;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (bmVar.g.getBundle("savedInstanceState") == null) {
            bmVar.g.putBundle("savedInstanceState", new Bundle());
        }
        try {
            bmVar.h = bmVar.g.getSparseParcelableArray("viewState");
            bm bmVar2 = this.a;
            bmVar2.i = bmVar2.g.getBundle("viewRegistryState");
            cm cmVar = (cm) bmVar2.g.getParcelable("state");
            if (cmVar != null) {
                bmVar2.n = cmVar.m;
                bmVar2.o = cmVar.n;
                Boolean bool = bmVar2.j;
                if (bool != null) {
                    bmVar2.R = bool.booleanValue();
                    bmVar2.j = null;
                } else {
                    bmVar2.R = cmVar.o;
                }
            }
            if (bmVar2.R) {
                return;
            }
            bmVar2.Q = true;
        } catch (BadParcelableException e) {
            bm bmVar3 = this.a;
            Objects.toString(bmVar3);
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment ".concat(String.valueOf(bmVar3)), e);
        }
    }

    final void f() {
        bm bmVar = this.a;
        if (bmVar.P == null) {
            return;
        }
        if (ch.X(2)) {
            Objects.toString(bmVar);
            Objects.toString(bmVar.P);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        bmVar.P.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            bmVar.h = sparseArray;
        }
        Bundle bundle = new Bundle();
        bmVar.Z.b.Y(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        bmVar.i = bundle;
    }

    public cn(byz byzVar, co coVar, bm bmVar, Bundle bundle) {
        this.c = byzVar;
        this.d = coVar;
        this.a = bmVar;
        bmVar.h = null;
        bmVar.i = null;
        bmVar.z = 0;
        bmVar.v = false;
        bmVar.q = false;
        bm bmVar2 = bmVar.m;
        bmVar.n = bmVar2 != null ? bmVar2.k : null;
        bmVar.m = null;
        bmVar.g = bundle;
        bmVar.l = bundle.getBundle("arguments");
    }

    public cn(byz byzVar, co coVar, ClassLoader classLoader, bt btVar, Bundle bundle) {
        this.c = byzVar;
        this.d = coVar;
        cm cmVar = (cm) bundle.getParcelable("state");
        bm bmVarB = btVar.b(cmVar.a);
        bmVarB.k = cmVar.b;
        bmVarB.u = cmVar.c;
        bmVarB.w = cmVar.d;
        bmVarB.x = true;
        bmVarB.E = cmVar.e;
        bmVarB.F = cmVar.f;
        bmVarB.G = cmVar.g;
        bmVarB.J = cmVar.h;
        bmVarB.r = cmVar.i;
        bmVarB.I = cmVar.j;
        bmVarB.H = cmVar.k;
        bmVarB.Y = cwb.values()[cmVar.l];
        bmVarB.n = cmVar.m;
        bmVarB.o = cmVar.n;
        bmVarB.R = cmVar.o;
        this.a = bmVarB;
        bmVarB.g = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        bmVarB.setArguments(bundle2);
        if (ch.X(2)) {
            Objects.toString(bmVarB);
        }
    }
}
